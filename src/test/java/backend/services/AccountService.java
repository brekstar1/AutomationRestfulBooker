package backend.services;

import backend.endpoints.Endpoints;
import io.restassured.response.Response;
import modelObject.request.RequestAuthentication;
import modelObject.response.ResponseAuthentication;
import org.testng.Assert;

public class AccountService extends CommonService{

    public ResponseAuthentication createAuthenticationToken(RequestAuthentication requestBody) {
        Response response = post(requestBody, Endpoints.ACCOUNT_AUTHENTICATION_ENDPOINT);
        Assert.assertEquals(response.getStatusCode(), 200);
        return response.as(ResponseAuthentication.class);
    }
}
