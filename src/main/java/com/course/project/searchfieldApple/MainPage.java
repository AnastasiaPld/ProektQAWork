package com.course.project.searchfieldApple;

import com.course.project.registration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(name = "agree")
    private WebElement cookieBtn;

    @FindBy(name = "yfin-usr-qry")
    WebElement searchField;

    @FindBy(css = "#header-desktop-search-button")
    WebElement searchBtn;

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public PageOfCompany searchCompany(String name) {
        cookieBtn.click();
        searchField.sendKeys(name);
        searchBtn.click();
        return new PageOfCompany(driver);
    }
}




