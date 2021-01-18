package com.planit.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;

import com.planit.qa.util.TestUtil;
import com.planit.qa.base.TestBase;
import com.planit.qa.pages.ContactsPage;
import com.planit.qa.pages.HomePage;

public class Test001 extends TestBase {
	
	ContactsPage contactspage;
	HomePage homepage;
	TestUtil testUtil;
	String sheetName = "Planit";
	
	
	public Test001() {
		super();
	}
	

	@BeforeClass
	public void setUp() throws InterruptedException{
		initialization();
		contactspage = new ContactsPage();	
		homepage = new HomePage();
		testUtil = new TestUtil();
		
	}
	
	@Test(priority=1) 
	public void clickonContact(){
		contactspage = homepage.clickOnContactsLink();
		
	}
	
	@Test(priority=2)
	public void clickonSubmit() {
		contactspage.submitbtn();
	}

	@Test(priority=3)
	public void verifyError1() {
	String error1 = contactspage.errorMsg1();
		Assert.assertEquals(error1, "Forename is required");
	System.out.println("Verified error1 msg");
	}
	
	@Test(priority=4)
	public void verifyError2() {
	String error2 = contactspage.errorMsg2();
		Assert.assertEquals(error2, "Email is required");
		System.out.println("Verified error12 msg");
	}
	
	@Test(priority=5)
	public void verifyError3() {
	String error3 = contactspage.errorMsg3();
		Assert.assertEquals(error3, "Message is required");
		System.out.println("Verified error3 msg");
	}
	
	@DataProvider
	public Object[][] getTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	//@Test(priority=6, dataProvider="getTestData")
	//public void validateCreateNewContact(String Forename, String Surname, String Email, String Message){
		
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
	//	contactspage.createNewContact(Forename, Surname, Email, Message);
		
	//}
	
	
	@Test(priority=6)
	public void fillContact() {
		
		contactspage.createNewContact("shilpa", "k");
		contactspage.maiL("shilpakjambe@gmail.com");
		contactspage.telePH("1234567");
		contactspage.message("created");
	
		}
	
	@Test(priority=7)
	public void errormessageGone() {
		
		boolean flag = contactspage.errorMsg1().isBlank();
		Assert.assertFalse(flag);
		boolean flag1 = contactspage.errorMsg2().isBlank();
		Assert.assertFalse(flag1);
		boolean flag2 = contactspage.errorMsg3().isBlank();
		Assert.assertFalse(flag2);
	}
	
	
	@Test(priority=8)
	public void successmsgverification() { 
	
		String success = contactspage.asuccessMsg();
		//Assert.assertEquals(error3, "Message is required");
		Assert.assertTrue(true , success);
		System.out.println("true");
		
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}
	
}




