package WebTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @Given("user open browser")
    public void userOpenBrowser() {
    }

    @When("user enter URL")
    public void userEnterURL() {
    }

    @Then("user open browser successfully")
    public void userOpenBrowserSuccessfully() {
    }

    @Given("user on home page")
    public void userOnHomePage() {
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        homePage.userClickOnLoginButton();

    }

    @Then("user open login page successfully")
    public void userOpenLoginPageSuccessfully()
    {
      loginPage.userEntersLoginDetails();
    }
}
