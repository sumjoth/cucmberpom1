Feature: to add my customer plan
  I want to use this template for my feature file

  Scenario: to add customer
    Given the user should be telecom homepage and click the add customer
    When The user provide valid details
      | fname   | lname | email         | address  | phone    |
      | ganesh  | js    | gg@gmail.com  | chennai  |  6452121 |
      | vignesh | m     | vv@gmail.com  | erode    | 99541211 |
      | aravind | s     | aa@gmail.com  | trichy   |   545512 |
      | dinesh  | s     | ddd@gmail.com | namakkal | 54515151 |
    And The user submits the form
    Then To genatrate the customer id
