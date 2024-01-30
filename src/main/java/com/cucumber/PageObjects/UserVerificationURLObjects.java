package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserVerificationURLObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click the Verification URL
	By verificationurl= By.xpath("//h4[contains(text(),'https://demosales.learningchain.in/certificate-ver')]");

	


	public UserVerificationURLObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void ClicktheVerificationURL() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(verificationurl), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(verificationurl).click();
		Thread.sleep(3000);
		

	}
	
}