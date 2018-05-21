package com.crm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// page factory -OR

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	
	@FindBy(xpath = "//input[@type ='submit' and @value ='Login' and @class='btn btn-small']")
	WebElement loginBtn;	

	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;


	// Initializing the page objects
	public LoginPage() {
		// this means current class object or pointing to current class
		PageFactory.initElements(driver, this);
	}

	public String validateLoginTitle() {
		return driver.getTitle();
	}

	public boolean validatecrmImage() {
		return crmLogo.isDisplayed();
	}
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.sendKeys(Keys.ENTER);
		
		return new HomePage();
	}

}
