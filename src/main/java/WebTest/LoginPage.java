package WebTest;

import org.openqa.selenium.By;

public class LoginPage extends Util{
    private By _VerifyLoginPage = By.linkText("Login ");
     String ExpectedResult = "Login ";
    private By _EmailAddress = By.id("inputEmail");
    private By _Password     = By.id("inputPassword");

   // public void verifyUserOnLoginPage()
   // {
     // assertTextMessage(getTextElements(_VerifyLoginPage),ExpectedResult,"Login");
     // System.out.println("Login");
    //}
      public void userEntersLoginDetails()
      {
       typeText(_EmailAddress,"Anjali9+"+System.currentTimeMillis()+"@gmail.com");
       typeText(_Password,"Kavya2018");
      }
}
