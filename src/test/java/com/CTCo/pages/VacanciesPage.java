package com.CTCo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VacanciesPage extends HomePage {
    @FindBy (xpath = "//*[@id=\"menu-item-5079\"]/a")
    public WebElement TestAutomationButton;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/ul[1]")
    public WebElement table;
}
