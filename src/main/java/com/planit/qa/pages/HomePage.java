package com.planit.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.planit.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//a[contains(text(), 'Contact')]")
	@CacheLookup
	WebElement contactsLink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	

	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public ShopPage clickOnShopPage() {
		driver.findElement(By.xpath("//*[@id=\"nav-shop\"]/a")).click();;
		return new ShopPage();
	}
	
	
	
	
}
