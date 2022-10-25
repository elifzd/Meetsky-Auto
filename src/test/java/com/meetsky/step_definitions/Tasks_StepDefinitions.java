package com.meetsky.step_definitions;

import com.meetsky.pages.TaskPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tasks_StepDefinitions {

    TaskPage taskPage = new TaskPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        taskPage.login();
    }
    @Given("the user enter the tasks section")
    public void the_user_enter_the_tasks_section() {

    }
    @When("user click create new list button")
    public void user_click_create_new_list_button() {

    }
    @When("user enter a list name and click enter")
    public void user_enter_a_list_name_and_click_enter() {

    }
    @Then("user can see all the created lists")
    public void user_can_see_all_the_created_lists() {

    }

    @When("user enter a task name on task box")
    public void user_enter_a_task_name_on_task_box() {

    }
    @When("user click enter after name")
    public void user_click_enter_after_name() {

    }
    @Then("user can able to create new task and it should appear on the page")
    public void user_can_able_to_create_new_task_and_it_should_appear_on_the_page() {

    }
    @When("user click to the box near the name")
    public void user_click_to_the_box_near_the_name() {

    }
    @Then("user should be able to add the task to the completed tasks")
    public void user_should_be_able_to_add_the_task_to_the_completed_tasks() {

    }
    @When("user created the tasks")
    public void user_created_the_tasks() {

    }
    @When("user click to the star near the task name")
    public void user_click_to_the_star_near_the_task_name() {

    }
    @Then("user should be able to add the task to the important tasks")
    public void user_should_be_able_to_add_the_task_to_the_important_tasks() {

    }

    @When("user check left column {string} section")
    public void user_check_left_column_section(String string) {

    }
    @Then("user should see the number of uncompleted tasks next to current tab")
    public void user_should_see_the_number_of_uncompleted_tasks_next_to_current_tab() {

    }
    @When("user will click create new list button")
    public void user_will_click_create_new_list_button() {

    }
    @When("user enter a existing list name and click enter")
    public void user_enter_a_existing_list_name_and_click_enter() {

    }
    @Then("user can see error message")
    public void user_can_see_error_message() {

    }


}
