package team.gpt.pecare.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author yifei
 * user register request
 * used to receive arguement passed by front end when user register
 */
@Data
public class UserRegisterRequest implements Serializable {


    @Serial
    private static final long serialVersionUID = 7110905951068246434L;

    private String userName;
    private String userAccount;
    private String userPassword;

}
