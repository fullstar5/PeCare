package team.gpt.pecare.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import team.gpt.pecare.model.domain.UserOrder;
import team.gpt.pecare.mapper.UserOrderMapper;
import org.springframework.stereotype.Service;
import team.gpt.pecare.service.UserOrderService;

import java.util.List;

/**
* @author Administrator
* @description 针对表【user_order(order_table)】的数据库操作Service实现
* @createDate 2024-04-05 00:21:11
*/
@Service
public class UserOrderServiceImpl extends ServiceImpl<UserOrderMapper, UserOrder>
    implements UserOrderService {

    @Autowired
    private UserOrderMapper userOrderMapper;
    @Override
    public List<UserOrder> getAllOrders() {
        return userOrderMapper.getAllOrders();
    }
}




