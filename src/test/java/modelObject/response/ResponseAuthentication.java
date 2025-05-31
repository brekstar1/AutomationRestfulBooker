package modelObject.response;

import lombok.Getter;
import lombok.Setter;


public class ResponseAuthentication {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
