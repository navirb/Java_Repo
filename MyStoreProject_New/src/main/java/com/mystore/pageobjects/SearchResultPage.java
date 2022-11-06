package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class SearchResultPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"center_column\"]//img")
	WebElement prodcuctResult;

	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean isProductAvailable() {
		return Action.isDisplayed(driver, prodcuctResult);
	}

	public AddToCartPage clickOnProduct()
	{
		Action.click(driver, prodcuctResult);
		return new AddToCartPage();
	}

}
