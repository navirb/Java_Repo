package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class OrderConfirmationPage extends BaseClass {

	@FindBy(xpath = "//p/strong[contains(text(),'Your order on My Stor is completed']")
	WebElement confirmMessag;

	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateConfirmMessage() {
		String confirmMsg = confirmMessag.getText();
		return confirmMsg;
	}

}
