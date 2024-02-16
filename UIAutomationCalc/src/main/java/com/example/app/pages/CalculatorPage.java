package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

  public boolean checkSideMenuAppear() {
    //explicit wait
    By locator = MobileBy.AccessibilityId("Navigation header");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

  public String getTitleSideMenu() {
    return getText(MobileBy.xpath("//android.widget.TextView[@text=\"Android Studio\"]"));
  }

  public String getTextboxAngka() {
    return getText(MobileBy.xpath("//android.widget.EditText[@resource-id=\"com.isl.simpleapp:id/et_1\"]"));
  }

  public String checkOperationDropdownAppear() {
    return getText(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"/\"]"));
  }

  public String checkOnOperationSelected() {
    return getText(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"/\"]"));
  }

  public String checkOnOperation() {
    return getText(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]"));
  }

  public String checkOnResult() {
    return getText(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.isl.simpleapp:id/tv_result\"]"));
  }

}
