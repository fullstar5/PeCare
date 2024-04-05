package team.gpt.pecare;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import team.gpt.pecare.controller.UserController;
import team.gpt.pecare.model.domain.request.UserLoginRequest;
import team.gpt.pecare.service.UserService;

@WebMvcTest(UserController.class)
@AutoConfigureMockMvc
public class LoginTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private UserService userService; // Mock UserService bean
    @Test
    public void testUserLogin() throws Exception {
        // 创建一个示例的用户登录请求对象
        UserLoginRequest userLoginRequest = new UserLoginRequest();
        userLoginRequest.setUserAccount("testAccount");
        userLoginRequest.setUserPassword("testPassword");

        // 发送 POST 请求到 /login 接口，并传递用户登录请求体
        mockMvc.perform(MockMvcRequestBuilders.post("/user/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(userLoginRequest)))
                .andExpect(MockMvcResultMatchers.status().isOk()); // 期望响应状态码为 200
    }

    // 将对象转换为 JSON 字符串的辅助方法
    private String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
