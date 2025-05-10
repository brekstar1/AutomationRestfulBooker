package tests.backend;

import backend.services.AccountService;
import modelObject.ModelPath;
import modelObject.request.RequestAuthentication;
import modelObject.response.ResponseAuthentication;
import org.testng.annotations.Test;
import sharedData.Hooks;

public class AuthenticationBETest extends Hooks {

    @Test
    public void testMethod() {
        AccountService accountService = new AccountService();

        System.out.println("=== CREATE TOKEN ===");
        RequestAuthentication requestBody = new RequestAuthentication(ModelPath.REQUEST_AUTHENTICATION_PATH);
        ResponseAuthentication responseAuthentication = accountService.createAuthenticationToken(requestBody);
        String token = responseAuthentication.getToken();
        System.out.println(token);
    }
}