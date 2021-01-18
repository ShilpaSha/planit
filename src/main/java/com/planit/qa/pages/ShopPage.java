package com.planit.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.planit.qa.base.TestBase;

public class ShopPage extends TestBase{

	@FindBy(xpath = "//*[@id=\"product-6\"]/div/p/a")
	WebElement funnyC;
	
	@FindBy(xpath = "//*[@id=\"product-4\"]/div/p/a")
	WebElement fluffyB;
	
	@FindBy(xpath = "//*[@id=\"nav-cart\"]/a")
	WebElement cart;
	
	// Initializing the Page Objects:
	public ShopPage() {
		PageFactory.initElements(driver, this);
	}

	


public void clickOnProducts() {

	funnyC.click();
	funnyC.click();
	fluffyB.click();
	
}

public CartPage cartPage() {
	cart.click();
	return new CartPage();
	
}
	

}
