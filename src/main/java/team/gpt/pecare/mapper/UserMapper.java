package team.gpt.pecare.mapper;

import org.apache.ibatis.annotations.Mapper;
import team.gpt.pecare.model.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author Administrator
 * @description 针对表【user(user_table)】的数据库操作Mapper
 * @createDate 2024-04-04 21:16:20
 * @Entity team.gpt.pecare.model.domain.User
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}