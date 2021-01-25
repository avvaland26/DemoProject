Feature: user open browser successfully
  @Test
  Scenario: user open browser successfully
    Given   user open browser
    When    user enter URL
    Then    user open browser successfully
    @Test1
    Scenario: user open login page successfully
      Given   user on home page
      When    user clicks on login button
      Then    user open login page successfully