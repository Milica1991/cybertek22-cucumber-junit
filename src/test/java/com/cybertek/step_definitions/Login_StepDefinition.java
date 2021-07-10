package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinition {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("USer is on the login page");

    }
    @When("use enter librarian username")
    public void use_enter_librarian_username() {
        System.out.println("User enters librarian username");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard");

    }


}
