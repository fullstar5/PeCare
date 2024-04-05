package team.gpt.pecare.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderUpdateRequest {
    private int id;
    private String orderName;
    private String orderDescription;
    private int creditsReward;
    private int accept;



}
