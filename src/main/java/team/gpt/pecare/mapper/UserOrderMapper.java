package team.gpt.pecare.mapper;

import org.apache.ibatis.annotations.Mapper;
import team.gpt.pecare.model.domain.UserOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author Administrator
* @description 针对表【user_order(order_table)】的数据库操作Mapper
* @createDate 2024-04-05 00:21:11
* @Entity team.gpt.pecare.model.domain.UserOrder
*/
@Mapper
public interface UserOrderMapper extends BaseMapper<UserOrder> {
    List<UserOrder> getAllOrders();
}




