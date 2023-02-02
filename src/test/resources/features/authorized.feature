
Feature: Authorized

  @wip
  Scenario: User should able to be authorized
    Given User should be authorized with valid credentials
    Then verify authorized Status Code