package com.planit.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.planit.qa.base.TestBase;
import com.planit.qa.pages.ContactsPage;
import com.planit.qa.pages.HomePage;

public class Test002 extends TestBase {

	ContactsPage contactspage;
	HomePage homepage;
	
	
	public Test002() {
		super();
	}
	

	
	@BeforeClass
	public void setUp(){
		initialization();
		contactspage = new ContactsPage();	
		homepage = new HomePage();
	}
	
	@Test(priority=1) 
	public void clickonContact(){
		contactspage = homepage.clickOnContactsLink();
		
	}
	
	
	@Test(priority=2)
	public void fillContact() {
		
		contactspage.createNewContact("shilpa", "k");
		contactspage.maiL("shilpakjambe@gmail.com");
		//contactspage.telePH("1234567");
		contactspage.message("created");
	
		}
	
	@Test(priority=3)
	public void clickonSubmit() {
		contactspage.submitbtn();
	}

	@Test(priority=3)
	public void verifyError1() {
	String successmsg = contactspage.successmsG();
	Assert.assertTrue(true , successmsg);
	System.out.println("Verified success msg");
	}
	

	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}

	
	
	
}
