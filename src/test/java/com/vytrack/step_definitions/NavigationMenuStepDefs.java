package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {

    @When("the user navigates to Fleet, vehicle")
    public void the_user_navigates_to_Fleet_vehicle() {
        // selenium code
        System.out.println("the user navigates to fleet, vehicle");

    }
    @Then("title should be Vehicle")
    public void title_should_be_Vehicle() {
        // selenium code
        System.out.println("Expected and Actual title are matching");
    }
    @When("the user navigates to Marketing - Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        // selenium code
        System.out.println("the user navigates to Marketing, Campaigns");
    }

    @Then("title should be Campaigns")
    public void title_should_be_Campaigns() {
        System.out.println("Expected and Actual title are matching");
    }

    @Given("the user enters the sale manager information")
    public void the_user_enters_the_sale_manager_information() {
        // selenium code
        System.out.println("the user enters the sale manager information");
    }

    @When("the user navigates to Activities -- Calender Events")
    public void the_user_navigates_to_Activities_Calender_Events() {
        System.out.println("the user navigates to Activities -- Calender Events");
    }

    @Then("title should be Calendars")
    public void title_should_be_Calendars() {
        System.out.println("Expected and Actual title are matching");
    }


}
