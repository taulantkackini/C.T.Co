Feature: Assignment
@wip
  Scenario: Verification of the count of skills
    When user is on the home page of C.T.Co
    And user hovers Career button in the dashboard
    Then user clicks Vacancies
    When user is at Vacancies page and clicks "Test Automation Engineer" from the menu
    Then Verify that exact count of skills under the paragraph ‘Professional skills and qualification’ are 8
