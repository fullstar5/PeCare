package team.gpt.pecare.model.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * user_table
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * user id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * username
     */
    private String username;

    /**
     * user account
     */
    private String useraccount;

    /**
     * user avatar
     */
    private String avatarurl;

    /**
     * user gender
     */
    private Integer gender;

    /**
     * user password
     */
    private String userpassword;

    /**
     * user phone number
     */
    private String phone;

    /**
     * user email
     */
    private String email;

    /**
     * 0 - normal
     */
    private Integer userstatus;

    /**
     * whether user has pets
     */
    private Integer havepets;

    /**
     * first create time
     */
    private Date createtime;

    /**
     * last update time
     */
    private Date updatetime;

    /**
     * 0 - not delete 1 - deleted
     */
    @TableLogic
    private Integer isdelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}