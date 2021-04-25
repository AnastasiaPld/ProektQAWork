package com.course.project.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {
    @FindBy(id = "usernamereg-firstName")
    private WebElement firstName;

    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(name = "yid")
    private WebElement emailAddress;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "phone")
    private WebElement phoneNumber;

    @FindBy(name = "mm")
    private WebElement birthMonth;

    @FindBy(name = "dd")
    private WebElement birthDate;

    @FindBy(name = "yyyy")
    private WebElement birthYear;

    @FindBy(name = "signup")
    private WebElement signUpBtn;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


    public void submitName(String name) {
        executeOperationWithExplicitWait(10, ExpectedConditions.visibilityOf(firstName), 4);
        firstName.sendKeys(name);
    }

    public void submitSurname(String surname) {
        executeOperationWithExplicitWait(10, ExpectedConditions.visibilityOf(lastName), 4);
        lastName.sendKeys(surname);
    }

    public void submitPassword(String pass) {
        executeOperationWithExplicitWait(10, ExpectedConditions.visibilityOf(password), 4);
        password.sendKeys(pass);
    }

    public void submitEmail(String email) {
        executeOperationWithExplicitWait(10, ExpectedConditions.visibilityOf(emailAddress), 4);
        emailAddress.sendKeys(email);
    }

    public void submitPhone(String phone) {
        executeOperationWithExplicitWait(10, ExpectedConditions.visibilityOf(phoneNumber), 4);

        phoneNumber.sendKeys(phone);
    }

    public void selectMonth() {
        executeOperationWithExplicitWait(15, ExpectedConditions.visibilityOf(birthMonth), 4);

        Select month = new Select(birthMonth);
        month.selectByValue("3");
    }

    public void submitDayOfBirth(String day) {
        executeOperationWithExplicitWait(10, ExpectedConditions.visibilityOf(birthDate), 4);

        birthDate.sendKeys(day);
    }

    public void submitYearOfBirth(String year) {
        executeOperationWithExplicitWait(10, ExpectedConditions.visibilityOf(birthYear), 4);

        birthYear.sendKeys(year);
    }

    public void signUpBtn() {
        executeOperationWithExplicitWait(10, ExpectedConditions.visibilityOf(signUpBtn), 4);

        signUpBtn.click();
    }


}







