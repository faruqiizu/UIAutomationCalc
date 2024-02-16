@calc @android
Feature: Calculator Main Page

  @test @positive
  Scenario:Verify textbox Angka are enable
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user click textbox Angka
    And user can do input on textbox Angka

  @test @positive
  Scenario:Verify burger button can be clicked
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user click burger button
    And user see side menu calculator

  @test @positive
  Scenario:Verify operation dropdown button can be clicked
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user click dropdown button
    And user see operation dropdown menu

  @test @positive
  Scenario:Verify operation feature can be selected
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user click dropdown button
    And user click on any operation feature

  @test @negative
  Scenario:Verify equal operation button are active
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user click equal operation button
    And user see notification message for input the numbers first

  @test @positive
  Scenario:Verify calculate after input any numbers
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user click textbox Angka
    And user input first Angka "10"
    When user click dropdown button
    And user click on any operation feature
    And user see operation will use for operation
    When user click textbox Angka
    And user input second Angka "10"
    Then user click equal operation button
    And user sees the result