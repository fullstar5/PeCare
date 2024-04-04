package team.gpt.pecare.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import team.gpt.pecare.model.domain.User;
import team.gpt.pecare.service.UserService;
import team.gpt.pecare.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【user(user_table)】的数据库操作Service实现
* @createDate 2024-04-04 21:16:20
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




