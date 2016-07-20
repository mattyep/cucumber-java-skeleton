package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    @Given("^I am authenticated$")
    public void I_am_authenticated() throws Throwable {
    }
    @When("^I click on logout$")
    public void I_click_on_logout() throws Throwable {
    }
    @Then("^I am logged out$")
    public void I_am_looged_out() throws Throwable {
    }
}
