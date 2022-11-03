package com.CTCo.pages;

import com.CTCo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy( xpath = "//*[@id=\"menu-item-127\"]/a")
    public WebElement career;

    @FindBy( xpath = "//*[@id=\"menu-item-131\"]/a")
    public WebElement vacanciesUnderDroppingMenu;
}
