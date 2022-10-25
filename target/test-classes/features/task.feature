@wip
Feature: Tasks Module Functionality
  Agile story: As a user, I should be able to create a new task list or
  a single task and add any task to completed and important tasks list.

  Background:
    Given the user is on the login page
    And the user enter the tasks section

  Scenario: Creating new list of tasks verification
    When user click create new list button
    And user enter a list name and click enter
    Then user can see all the created lists

  Scenario: Creating new task verification
    When user enter a task name on task box
    And user click enter after name
    Then user can able to create new task and it should appear on the page

  Scenario: Adding task to completed tasks
    When user created the tasks
    And user click to the box near the name
    Then user should be able to add the task to the completed tasks

  Scenario: Adding task to important tasks
    When user created the tasks
    And user click to the star near the task name
    Then user should be able to add the task to the important tasks

  Scenario: Checking the number of all uncompleted tasks
    When user check left column "Current Tab" section
    Then user should see the number of uncompleted tasks next to current tab

  Scenario: Checking not able to create a new list of task with already existing name
    When user will click create new list button
    And user enter a existing list name and click enter
    Then user can see error message


