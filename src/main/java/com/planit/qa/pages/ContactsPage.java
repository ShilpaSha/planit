package com.planit.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.planit.qa.base.TestBase;

public class ContactsPage extends TestBase
{

	@FindBy(xpath = "//input[@id='forename']")
	WebElement foreName;
	
	@FindBy(xpath = "//input[@id='surname']")
	WebElement surName;
	
	@FindBy(id="email")
	WebElement emailId;
	
	@FindBy(id="telephone")
	WebElement telePhone;
	
	@FindBy(id="message")
	WebElement messageArea;
	
	@FindBy(xpath = "//a[contains(text(),'Submit')]")
	WebElement submit;
	
	@FindBy(id="forename-err")
	WebElement aerrormsg1;
	
	@FindBy(id="email-err")
	WebElement aerrormsg2;
	
	@FindBy(id="message-err")
	WebElement aerrormsg3;
	
	@FindBy(xpath = "//strong[contains(text(),'We welcome your feedback')]")
	WebElement asuceess;
	
	@FindBy(xpath = "//strong[contains(text(),'Thanks shilpa')]")
	WebElement successM;
	
	//strong[contains(text(),'We welcome your feedback')]

	String actualmsg;

    // Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	
	public void createNewContact(String frname, String surname){
		
		
		foreName.sendKeys(frname);
		surName.sendKeys(surname);
		
	}
	
	public void maiL(String mail) {
		emailId.sendKeys(mail);
	}
	
	
	public void telePH(String teleph) {
		telePhone.sendKeys(teleph);
	}  
	
	public void message(String msg) {
	messageArea.sendKeys(msg);
	}
	
	public void submitbtn() {
        submit.click();
	}
	
	public String errorMsg1() {
	return actualmsg = aerrormsg1.getText();
			
	}
	
	public String errorMsg2() {
		String actualmsg2 = aerrormsg2.getText();
		return actualmsg2 ;
		
	}
	
	public String errorMsg3() {
		String actalmsg3 = aerrormsg3.getText();
		return actalmsg3;
		
	}
	
	public String asuccessMsg() {
		String successmsg = asuceess.getText();
		return successmsg;
	}
	
	public String successmsG() {
		String successmsgbtn = successM.getText();
		return successmsgbtn;
	}
	
}
