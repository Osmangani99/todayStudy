Feature: Login

  @regression @smoke @login @test
  Scenario: Login with valid email and password
    Given I am at talentTEK Home Page
    And I enterd valid ID
    And  I entred valid password
    When I click on login button
    Then I verify I successfully logged in my account
