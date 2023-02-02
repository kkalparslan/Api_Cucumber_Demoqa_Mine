
  Feature: User should able to generate new token

    @generate
    Scenario: User should input the valid credentials
      Given input valid credentials
      Then verify token status