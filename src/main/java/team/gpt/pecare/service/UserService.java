package team.gpt.pecare.service;

import team.gpt.pecare.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import javax.servlet.http.HttpServletRequest;
/**
 * @author Administrator
 * @description 针对表【user(user_table)】的数据库操作Service
 * @createDate 2024-04-04 21:16:20
 */
public interface UserService extends IService<User> {
    long userRegister(String userName, String userAccount, String userPassword);


    User userLogin(String userAccount, String userPassword, HttpServletRequest request) throws Exception;


    int userLogout(HttpServletRequest request);

}