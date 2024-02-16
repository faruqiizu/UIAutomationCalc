package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class NavigationMenu extends BasePageObject {

  public void clickHamburgerBtn(){
    click(MobileBy.AccessibilityId("Open navigation drawer"));
  }

  public void clickListMenu(){
    click(MobileBy.id("nav_list"));
  }

  public void clickTextboxAngka(){
    click(MobileBy.id("com.isl.simpleapp:id/et_1"));
  }

  public void clickOperationDropdownMenu(){
    click(MobileBy.id("com.isl.simpleapp:id/spinner_1"));
  }

  public void clickEqualOperationBtn(){
    click(MobileBy.id("com.isl.simpleapp:id/acb_calculate"));
  }

  public void inputNumberInOperation (String nmbr) {
    type(MobileBy.id("com.isl.simpleapp:id/et_1"), nmbr);
  }

  public void inputNumberInOperations (String nmbr) {
    type(MobileBy.id("com.isl.simpleapp:id/et_2"), nmbr);
  }

  public void clickAnyOperation () {
    click(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"/\"]"));
  }
}
