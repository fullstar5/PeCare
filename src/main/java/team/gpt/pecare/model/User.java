package team.gpt.pecare.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class User implements Serializable {
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;

    /**
     * A default constructor without any attributes is required for JSON-Object conversion
     */
    public User() {
    }

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get a string like "Person@7f54[name=Stephen,age=29,smoker=false]"
     *
     * @return
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "[" +
                "userId=" + userId + "," +
                "name=" + name + "," +
                "email=" + email +
                "]";
    }
}