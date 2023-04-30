package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;
/*
 * Name: Login Page
 * Description : Manages the Locators and Methods of LoginPage 
 * Developed By: Shantosh
 * Reviewed By : Radhika 
 * Date Reviewed: 04/27/2023
 */

public class LoginPage extends DriverScript {

	// **********Page Locators*******************

	@FindBy(id = "username")
	WebElement usernameTextbox;
	@FindBy(name = "pwd")
	WebElement passwordTextbox;
	@FindBy(xpath = "//div[text()='Login ']")
	WebElement loginButton;
	@FindBy(className = "errormsg")
	WebElement errmsgText;
	@FindBy(linkText = "Forgot your password?")
	WebElement forgotpwdLink;
	@FindBy(xpath = "//div[@class='atLogoImg']")
	WebElement actImage;

	// **********Page Initialization*************

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// **********Page Action/Methods*************
	public void enterUsername(String username) {
		
		usernameTextbox.sendKeys(username);

	}

	public void enterPassword(String pwd) {
		
		passwordTextbox.sendKeys(pwd);
	}

	public void clickLoginButton() {
		
		loginButton.click();
	}

	public String getErrMsgText() {
		
		return errmsgText.getText();
	}

	public boolean verifyForgotpwdLink() {
		
		return forgotpwdLink.isDisplayed();
	}

	public boolean verifyActImg() {
		
		return actImage.isDisplayed();
	}

	public String getLoginPageTitle() {
		
		return driver.getTitle();
	}
}
