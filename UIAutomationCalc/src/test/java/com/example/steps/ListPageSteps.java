package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ListPageSteps extends BaseTest {

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

    @When("user long press list button")
    public void userLongPressListButton() {
    }

    @And("user see list menu")
    public void userSeeListMenu() {
    }

    @When("user multiple press list button")
    public void userMultiplePressListButton() {
    }
}
