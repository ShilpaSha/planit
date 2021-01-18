package com.planit.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.planit.qa.base.TestBase;
import com.planit.qa.pages.ContactsPage;
import com.planit.qa.pages.HomePage;
import com.planit.qa.pages.ShopPage;

public class Test004 extends TestBase {

	HomePage homepage;
	ShopPage shoppage;
	
	public Test004() {
		super();
	}
	

	
	@BeforeClass
	public void setUp(){
		initialization();
		homepage = new HomePage();
		shoppage = new ShopPage();
	}
	
	@Test(priority=1) 
	public void clickonShop(){
		shoppage = homepage.clickOnShopPage();
		
	}
	
	
	@Test(priority=2)
	public void addProducts() {
		
		shoppage.clickOnProducts();
		shoppage.cartPage();
		
	
		}
	
	

	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}

	
	
	
}

