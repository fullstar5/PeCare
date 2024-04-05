package team.gpt.pecare.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import team.gpt.pecare.model.domain.UserOrder;
import team.gpt.pecare.model.domain.request.OrderCreateRequest;
import team.gpt.pecare.model.domain.request.OrderUpdateRequest;
import team.gpt.pecare.service.UserOrderService;

import javax.annotation.Resource;

@RestController
@EnableWebMvc
@RequestMapping("/order")
public class OrderController {
    @Resource
    private UserOrderService userOrderService;

    @PostMapping("/update")
    public long orderUpdate(@RequestBody OrderUpdateRequest orderUpdateRequest) throws Exception {
        if (orderUpdateRequest == null){
            throw new Exception("order update request is null");
        }
        int update_id = orderUpdateRequest.getId();
        String update_orderName = orderUpdateRequest.getOrderName();
        String update_orderDescription = orderUpdateRequest.getOrderDescription();
        int update_creditsReward = orderUpdateRequest.getCreditsReward();
        int update_accept = orderUpdateRequest.getAccept();

        UserOrder update_order = userOrderService.getById(update_id);
        if (update_order == null) {
            throw new Exception("Order with id " + update_id + " not found");
        }
        update_order.setOrdername(update_orderName);
        update_order.setOrderdescription(update_orderDescription);
        update_order.setCreditsreward(update_creditsReward);
        update_order.setAccept(update_accept);
        boolean success = userOrderService.updateById(update_order);
        if (!success){
            return -1;
        }
        return 1;
    }

    @PostMapping("/create")
    public long orderCreate(@RequestBody OrderCreateRequest orderCreateRequest) throws Exception {
        if (orderCreateRequest == null){
            throw new Exception("order create request is null");
        }
        UserOrder order = new UserOrder();
        order.setRequesterid((long)orderCreateRequest.getRequesterID());
        order.setRequesterpetid((long)orderCreateRequest.getRequesterPetID());
        order.setVolunteerid((long)orderCreateRequest.getVolunteerID());
        order.setOrdername(orderCreateRequest.getOrderName());
        order.setOrderdescription(orderCreateRequest.getOrderDescription());
        order.setCreditsreward(orderCreateRequest.getCreditsReward());
        order.setAccept(orderCreateRequest.getAccept());
//        int requesterID = orderCreateRequest.getRequesterID();
//        int requesterPetID = orderCreateRequest.getRequesterPetID();
//        int volunteerID = orderCreateRequest.getVolunteerID();
//        String orderName = orderCreateRequest.getOrderName();
//        String orderDescription = orderCreateRequest.getOrderDescription();
//        int creditsReward = orderCreateRequest.getCreditsReward();
//        int accept = orderCreateRequest.getAccept();
        boolean success = userOrderService.save(order);
        if (!success){
            return -1;
        }
        return order.getId();
    }

}
