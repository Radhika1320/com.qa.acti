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

public class EnterPage extends DriverScript{
	
	// **********Page Locators*******************
	@FindBy(id ="logoutlink") WebElement logoutlink;
	@FindBy(xpath="//a[@class='userProfileLink username ']") WebElement userLoggedText; 
	@FindBy(xpath="//div[@id='container_tasks']") WebElement menuTask;
	@FindBy(xpath="//div[@id='container_reports']") WebElement menuReports;
	@FindBy(xpath="//div[@id='container_users']") WebElement  Users;
	// **********Page Initialization*************
	
	public EnterPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	// **********Page Action/Methods*************
	
	public void clickLogout() 
	{
	logoutlink.click();	
	}

public String getuserLoggedIn() 
{
	return userLoggedText.getText();
	
}
public void clickTaskmenu()
{
	menuTask.click();
}

}
