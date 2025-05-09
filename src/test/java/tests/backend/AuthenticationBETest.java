package tests.backend;

import backend.services.AccountService;
import org.testng.annotations.Test;

public class AuthenticationBETest {

    @Test
    public void testMethod(){
        AccountService accountService = new AccountService();

        System.out.println("=== CREATE TOKEN ===");
    }
}