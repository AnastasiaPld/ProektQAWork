package com.course.project.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    @FindBy(id = "header-signin-link")
    private WebElement signInBtn;

    @FindBy(name = "agree")
    private WebElement cookieBtn;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public CreateAccount signInBtn() {
        cookieBtn.click();
        signInBtn.click();

        return new CreateAccount(driver);
    }


}










