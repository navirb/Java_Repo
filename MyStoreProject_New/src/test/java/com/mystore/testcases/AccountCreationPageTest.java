package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class AccountCreationPageTest extends BaseClass {

	IndexPage indexPage;
	LoginPage loginPage;
	AccountCreationPage acctCreationPage;

	@BeforeMethod
	public void setUp() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void verifyCreateAccountPageTest() {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		acctCreationPage = loginPage.createNewAccount("abc324@gmail.com");
		boolean result = acctCreationPage.validateAccountCreationPage();
		Assert.assertTrue(result);
	}

}
