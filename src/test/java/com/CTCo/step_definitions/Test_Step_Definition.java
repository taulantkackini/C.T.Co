package com.CTCo.step_definitions;

import com.CTCo.pages.HomePage;
import com.CTCo.pages.VacanciesPage;
import com.CTCo.utilities.ConfigurationReader;
import com.CTCo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Test_Step_Definition extends HomePage {
    Actions actions = new Actions(Driver.getDriver());
    VacanciesPage vacancies = new VacanciesPage();

    @When("user is on the home page of C.T.Co")
    public void user_is_on_the_home_page_of_c_t_co() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user hovers Career button in the dashboard")
    public void user_hovers_Career_button_in_the_dashboard() {
        actions.moveToElement(career);
        actions.click().build().perform();
    }
    @When("user clicks Vacancies")
    public void user_clicks_vacancies() {
        vacanciesUnderDroppingMenu.click();
    }

    @When("user is at Vacancies page and clicks \"Test Automation Engineer\" from the menu")
    public void user_is_at_vacancies_page_and_clicks_test_automation_engineer_from_the_menu() {
        vacancies.TestAutomationButton.click();
    }

    @Then("Verify that exact count of skills under the paragraph ‘Professional skills and qualification’ are {int}")
    public void verifyThatExactCountOfSkillsUnderTheParagraphProfessionalSkillsAndQualificationAre(int expectedValue) {
        List<WebElement> totalRawCount = vacancies.table.findElements(By.xpath("//div[1]/div[1]/div/div/ul[1]/li"));
        int actualValue = totalRawCount.size();

        Assert.assertEquals(actualValue, expectedValue);
        System.out.println("Test passed!");
    }
}
