package stepDefinition;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.login_page;

public class login_step extends config {

    login_page login = new login_page(driver);

    @Given("I am at talentTEK Home Page")
    public void iAmAtTalentTEKHomePage() {

    }

    @And("I enterd valid ID")
    public void iEnterdValidID() {
        login.enter_emailOrID();

    }

    @And("I entred valid password")
    public void iEntredValidPassword() {
        login.enter_password();

    }

    @When("I click on login button")
    public void iClickOnLoginButton() {

        login.click_login_button();

    }
}
