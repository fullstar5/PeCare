package team.gpt.pecare.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import team.gpt.pecare.common.BaseResponse;
import team.gpt.pecare.common.ResultUtils;
import team.gpt.pecare.model.domain.User;
import team.gpt.pecare.model.domain.request.UserLoginRequest;
import team.gpt.pecare.model.domain.request.UserRegisterRequest;
import team.gpt.pecare.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;
import java.util.stream.Collectors;

import static team.gpt.pecare.constant.UserContent.USER_LOGIN_STATE;

@RestController
@EnableWebMvc
@RequestMapping("/user")
public class UserController {

    static final Logger logger = LogManager.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) throws Exception {
        if (userRegisterRequest == null){
            throw new Exception("user register request is null");
        }
        String userName = userRegisterRequest.getUserName();
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        if (StringUtils.isAnyBlank(userAccount, userPassword)){
            throw new Exception("user account or password is blank is register request");
        }
        long id = userService.userRegister(userName, userAccount, userPassword);
        return ResultUtils.success(id);
    }

    @PostMapping("/login")
    public BaseResponse<User> userLogin(@RequestBody UserLoginRequest userLoginRequest) throws Exception {
        if (userLoginRequest == null){
            throw new Exception("user login request is empty when request");
        }
        String userAccount = userLoginRequest.getUserAccount();
        String userPassword = userLoginRequest.getUserPassword();
        if (StringUtils.isAnyBlank(userAccount, userPassword)){
            throw new Exception("user account or password is blank when login request");
        }
        User user = userService.userLogin(userAccount, userPassword);
        return ResultUtils.success(user);
    }

    @PostMapping("/logout")
    public BaseResponse<Integer> userLogout(HttpServletRequest request) throws Exception {
        if (request == null) {
            throw new Exception("user logout request is null");
        }
        int i = userService.userLogout(request);
        return ResultUtils.success(i);
    }

    @GetMapping("/currentUser")
    public BaseResponse<User> getCurrentUser(HttpServletRequest request) throws Exception {
        Object userObj = request.getSession().getAttribute(USER_LOGIN_STATE);
        User currentUser = (User) userObj;
        if (currentUser == null){
            throw new Exception("current user is null in currentUser request");
        }
        long userID = currentUser.getId();
        User byId = userService.getById(userID);
        return ResultUtils.success(byId);
    }


//    @GetMapping("/{userId}")
//    public String getUserByID(@PathVariable("userId") String userId) throws JsonProcessingException {
//        logger.info("entered getUserByID method, userId = " + userId);
//        User user = new User(userId, "neo", "neo@matrix.com");
//        return new ObjectMapper().writeValueAsString(user);
//    }
//
//    @GetMapping("/getAll")
//    public String getUser() throws JsonProcessingException {
//        logger.info("entered getUser method");
//        List<User> users = new ArrayList<>();
//        users.add(new User("001", "apoch", "123@matrix.com"));
//        users.add(new User("002", "switch", "13233@matrix.com"));
//        users.add(new User("003", "trinity", "1sdf3@matrix.com"));
//        users.add(new User("004", "neo", "neo@matrix.com"));
//        return new ObjectMapper().writeValueAsString(users);
//    }

}
