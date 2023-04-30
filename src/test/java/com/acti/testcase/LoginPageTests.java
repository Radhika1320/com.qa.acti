package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {
	

	@Test(enabled = true)
	public void testLoginPageTitle() 
	{
		String expected = "actiTIME - Login";
		String actual = lp.getLoginPageTitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
 
	}

	@Test(enabled = true)

	public void testactImageDisplayed() 
	{

		boolean flag = lp.verifyActImg();
		Assert.assertTrue(flag);

	}

	@Test(enabled = true)

	public void testForgotPasswordDisplayed() 
	{

		boolean flag = lp.verifyForgotpwdLink();
		Assert.assertTrue(flag);

	}

	@Test(enabled = true)
	public void testLogin() 
	{

		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();

	}

	@Test(enabled = true)

	public void testLoginInvalidCredentials() throws InterruptedException
	{

		lp.enterPassword("admin");
		lp.clickLoginButton();
		Thread.sleep(3000);
		String errmsg = lp.getErrMsgText();
		System.out.println(errmsg);
		Assert.assertTrue(errmsg.contains("Username or Password is invalid"));

	}
}
