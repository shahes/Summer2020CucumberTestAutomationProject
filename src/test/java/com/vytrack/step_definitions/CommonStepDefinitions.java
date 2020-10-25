package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonStepDefinitions {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage() ;

    @Given("user navigates to {string} and {string}")
    public void user_navigates_to_and(String string, String string2) {
        loginPage.navigateTo(string, string2);
    }

    @When("user clicks on save and close button")
    public void user_clicks_on_save_and_close_button() {
        basePage.clickSaveAndClose();
    }
}
