package techdojo.org.mobileautomation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techdojo.org.mobileautomation.dto.User;

public class LoginStepdefs {
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
    }

    @When("user input credentials")
    public void userInputCredentials(User user) {
    }

    @Then("user is able to access dashboard")
    public void userIsAbleToAccessDashboard() {
    }
}
