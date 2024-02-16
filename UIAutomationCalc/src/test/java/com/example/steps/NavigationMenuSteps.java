package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class NavigationMenuSteps extends BaseTest {
  @When("user go to list menu")
  public void userGoToListMenu() {
    navigationMenu.clickHamburgerBtn();
    navigationMenu.clickListMenu();
  }

    @When("user click burger button")
    public void userClickBurgerButton() {
    navigationMenu.clickHamburgerBtn();
    }

    @And("user see side menu calculator")
    public void userSeeSideMenuCalculator() {
      String titleText = calculatorPage.getTitleSideMenu();
      Assertions.assertEquals("Android Studio", titleText);

      boolean isDisplayed = calculatorPage.checkSideMenuAppear();
      Assertions.assertTrue(isDisplayed);
    }

  @When("user click textbox Angka")
  public void userClickTextboxAngka() {
  navigationMenu.clickTextboxAngka();
  }

  @And("user can do input on textbox Angka")
  public void userDoInputOnTextboxAngka() {
    String titleText = calculatorPage.getTextboxAngka();
    Assertions.assertEquals("Angka 1", titleText);
  }

  @When("user click dropdown button")
  public void userClickDropdownButton() {
  navigationMenu.clickOperationDropdownMenu();
  }

  @And("user see operation dropdown menu")
  public void userSeeDropdownMenu() {
    String titleText = calculatorPage.checkOperationDropdownAppear();
    Assertions.assertEquals("/", titleText);
  }

  @And("user click on any operation feature")
  public void userClickOnAnyOperationFeature() {
    String titleText = calculatorPage.checkOnOperationSelected();
    Assertions.assertEquals("/", titleText);
    navigationMenu.clickAnyOperation();
  }

  @When("user click equal operation button")
  public void userClickEqualOperationButton() {
    navigationMenu.clickEqualOperationBtn();
  }

  @And("user see notification message for input the numbers first")
  public void userSeeNotificationMessageForInputTheNumbersFirst() {
  }

  @And("user input first Angka {string}")
  public void userInputFirstAngka(String numbr) {
    navigationMenu.inputNumberInOperation(numbr);
  }

  @And("user sees the result")
  public void userSeesTheResult() {
    String titleText = calculatorPage.checkOnResult();
    Assertions.assertEquals("Hasil : 1", titleText);
  }

  @And("user input second Angka {string}")
  public void userInputSecondAngka(String numbr) {
    navigationMenu.inputNumberInOperations(numbr);
  }

  @And("user see operation will use for operation")
  public void userSeeOperationWillUseForOperation() {
    String titleText = calculatorPage.checkOnOperation();
    Assertions.assertEquals("/", titleText);
  }
}
