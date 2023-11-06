package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class LoginScreenTest {
    @Test
    public void testeSucessfulLogin(){
    LoginScreen loginScreen = new LoginScreen();
    Assertions.assertTrue(loginScreen.login("john", "password123"));
    }

    @Test
    public void testeFailedLogin(){
     LoginScreen loginScreen = new LoginScreen();
     Assertions.assertFalse(loginScreen.login("john", "wrong"));
    }

    @Test
    public void testeAdd(){
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.addUser("testuser", "testpassword");
        Assertions.assertTrue(loginScreen.login("testuser", "testpassword"));
    }

}
