package team.gpt.pecare.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * pet_table
 * @TableName pet
 */
@TableName(value ="pet")
@Data
public class Pet implements Serializable {
    /**
     * pet id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * pet name
     */
    private String petname;

    /**
     * corresponding user
     */
    private Long userid;

    /**
     * pet age
     */
    private Integer petage;

    /**
     * pet gender
     */
    private Integer petgender;

    /**
     * pet description
     */
    private String petdescription;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}