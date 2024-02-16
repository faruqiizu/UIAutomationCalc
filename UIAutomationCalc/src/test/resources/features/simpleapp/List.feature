@list @android
Feature: List

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    And user do scroll

  @test @positive
  Scenario:Verify list button when use long press
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user click burger button
    And user see side menu calculator
    When user long press list button
    And user see list menu

  @test @positive
  Scenario:Verify list button when use multiple press
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user click burger button
    And user see side menu calculator
    When user multiple press list button
    And user see list menu