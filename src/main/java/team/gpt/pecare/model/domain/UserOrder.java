package team.gpt.pecare.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * order_table
 * @TableName user_order
 */
@TableName(value ="user_order")
@Data
public class UserOrder implements Serializable {
    /**
     * order id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * order name
     */
    private String ordername;

    /**
     * order description
     */
    private String orderdescription;

    /**
     * user who post request
     */
    private Long requesterid;

    /**
     * pet that requires attention
     */
    private Long requesterpetid;

    /**
     * user who receive request
     */
    private Long volunteerid;

    /**
     * how many credits rewards
     */
    private Integer creditsreward;

    /**
     * when order should be proceed
     */
    private Date ordertime;

    /**
     * whether user has pets
     */
    private Integer accept;

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
    private Integer isdelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserOrder other = (UserOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrdername() == null ? other.getOrdername() == null : this.getOrdername().equals(other.getOrdername()))
            && (this.getOrderdescription() == null ? other.getOrderdescription() == null : this.getOrderdescription().equals(other.getOrderdescription()))
            && (this.getRequesterid() == null ? other.getRequesterid() == null : this.getRequesterid().equals(other.getRequesterid()))
            && (this.getRequesterpetid() == null ? other.getRequesterpetid() == null : this.getRequesterpetid().equals(other.getRequesterpetid()))
            && (this.getVolunteerid() == null ? other.getVolunteerid() == null : this.getVolunteerid().equals(other.getVolunteerid()))
            && (this.getCreditsreward() == null ? other.getCreditsreward() == null : this.getCreditsreward().equals(other.getCreditsreward()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getAccept() == null ? other.getAccept() == null : this.getAccept().equals(other.getAccept()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrdername() == null) ? 0 : getOrdername().hashCode());
        result = prime * result + ((getOrderdescription() == null) ? 0 : getOrderdescription().hashCode());
        result = prime * result + ((getRequesterid() == null) ? 0 : getRequesterid().hashCode());
        result = prime * result + ((getRequesterpetid() == null) ? 0 : getRequesterpetid().hashCode());
        result = prime * result + ((getVolunteerid() == null) ? 0 : getVolunteerid().hashCode());
        result = prime * result + ((getCreditsreward() == null) ? 0 : getCreditsreward().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getAccept() == null) ? 0 : getAccept().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ordername=").append(ordername);
        sb.append(", orderdescription=").append(orderdescription);
        sb.append(", requesterid=").append(requesterid);
        sb.append(", requesterpetid=").append(requesterpetid);
        sb.append(", volunteerid=").append(volunteerid);
        sb.append(", creditsreward=").append(creditsreward);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", accept=").append(accept);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}