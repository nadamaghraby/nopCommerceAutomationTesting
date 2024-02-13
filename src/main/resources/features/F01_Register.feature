@smoke
Feature: F01_Register | users could register with new accounts
# Positive Scenario
  Scenario: guest user could register with valid data successfully
# Given user go to register page
    When user clicks to register page
    And user chooses the gender
    And user enters the first name
    And user enters the last name
    And user chooses date of birth
    And user enters the email "test@example.com" field
    And user enters the company name
    And user enters password and confirm it "P@ssw0rd" "P@ssw0rd"
    And user clicks on register button
    Then the home is successfully opened


#  Scenario Outline: guest user could register with valid data successfully cases
## Given user go to register page
#    When user clicks to register page
#    And user chooses the gender
#    And user enters the first name "<firstNameRound>"
#    And user enters the last name "<lastNameRound>"
#    And user chooses date of birth
#    And user enters the email
#    And user enters the company name
#    And user enters password and confirm it
#    And user clicks on register button
#    Then the home is successfully opened
#    Examples:
#      | firstNameRound | lastNameRound |
#      | Nada | Elmaghraby |
#      | Fatma | Galal |
#      | Gehad | Mansour |

#  Here I made the first function of when in the stepDefs class then
#  right click on the rest and click on create all stepDefs functions in the class
#  Scenario outline to make many test cases using examples rounds
#  I can also insert data from here using scenario only and string next to each step