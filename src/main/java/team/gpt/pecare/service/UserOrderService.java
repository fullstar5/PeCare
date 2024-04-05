package team.gpt.pecare.service;

import team.gpt.pecare.model.domain.UserOrder;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Administrator
* @description 针对表【user_order(order_table)】的数据库操作Service
* @createDate 2024-04-05 00:21:11
*/
public interface UserOrderService extends IService<UserOrder> {
    List<UserOrder> getAllOrders();
}
