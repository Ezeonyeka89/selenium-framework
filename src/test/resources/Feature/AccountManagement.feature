@AccountManagement
Feature: Account management

  @CreateAccount
  Scenario Outline: create an account using a valid email address
    Given i am on create an account page
    When i enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And i click on create an account
    Then my account page is displayed


    Examples:
      | FirstName | LastName | Email           | Password  | ConfirmPassword |
      | Paul      | Makuo    | Life4@gmail.com | 12345@eze | 12345@eze       |


  @Accountlogin
  Scenario Outline: Registered customer to login with username and password
    Given i am on login page
    When i enter "<Email>" "<Password>"
    And i click on Sign in
    Then my account page is displayed

    Examples:
      | Email           | Password      |
      | Life4@gmail.com | 12345@eze |
