package team.gpt.pecare.model.domain.request;

import lombok.Data;

@Data
public class OrderCreateRequest {
    private int requesterID;
    private int requesterPetID;
    private int volunteerID;
    private String orderName;
    private String orderDescription;
    private int creditsReward;
    private int accept;
}
