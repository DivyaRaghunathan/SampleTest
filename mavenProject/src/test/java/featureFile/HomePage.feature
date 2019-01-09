Feature: Verify Home Page or search of iPad

  @Run
  Scenario: Verify whether the user is able to search for an item
    Given I want to open browser "Chrome"
    And I want to launch the application "https://www.amazon.com/"
    And I want to enter to text box "//input[@id='twotabsearchtextbox']" and a value is "iPad"
    Then I want to click on "//input[@value='Go']" text box
  


