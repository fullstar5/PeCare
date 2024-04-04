package team.gpt.pecare.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import team.gpt.pecare.model.domain.User;
import team.gpt.pecare.service.UserService;
import team.gpt.pecare.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import static team.gpt.pecare.constant.UserContent.USER_LOGIN_STATE;

/**
 * @author Administrator
 * @description 针对表【user(user_table)】的数据库操作Service实现
 * @createDate 2024-04-04 21:16:20
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public long userRegister(String userName, String userAccount, String userPassword) {
        // 1. basic check
        if (StringUtils.isAnyBlank(userName, userAccount, userPassword)){
            System.out.println("user account or user password not filled");
            return -1;
        }
        // 2. no repeat user account
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userAccount", userAccount);
        long count = userMapper.selectCount(queryWrapper);
        if (count > 0){
            System.out.println("user account already exist, try another one");
            return -1;
        }
        // 3. todo:encrypt password
        // 4. save user into database
        User user = new User();
        user.setUsername(userName);
        user.setUseraccount(userAccount);
        user.setUserpassword(userPassword);
        return user.getId();
    }

    @Override
    public User userLogin(String userAccount, String userPassword, HttpServletRequest request) throws Exception {
        // 1. basic check
        if (StringUtils.isAnyBlank(userAccount, userPassword)){
            throw new Exception("user account or password is blank when login");
        }
        // 2. todo:encrypt password
        // 3. match account and password
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userAccount", userAccount);
        queryWrapper.eq("userPassword", userPassword);
        User user = userMapper.selectOne(queryWrapper);
        if (user == null){
            throw new Exception("user account or password couldn't match when login");
        }
        // 4.record user session and return user
        request.getSession().setAttribute(USER_LOGIN_STATE, user);
        return user;
    }


    @Override
    public int userLogout(HttpServletRequest request) {
        request.getSession().removeAttribute(USER_LOGIN_STATE);
        return 1;
    }
}