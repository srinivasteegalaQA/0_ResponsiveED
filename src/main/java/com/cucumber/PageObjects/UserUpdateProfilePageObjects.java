package com.cucumber.PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserUpdateProfilePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// click the on Settings type
	By setting = By.xpath("//a[text()='Settings ']");
	// click the update profile option
	By update =By.xpath("//a[text()='Update Profile ']");
	// clear on First Name field
	By first = By.xpath("//input[@placeholder=' First Name']");
	// enter on First Name field
	By first1 = By.xpath("//input[@placeholder=' First Name']");
	// clear on Last Name field
	By last = By.xpath("//input[@placeholder=' Last Name']");
	// enter on Last Name field
	By last1 = By.xpath("//input[@placeholder=' Last Name']");
	// clear on Email id field
	By email = By.xpath("//input[@placeholder='Email Id']");
	// enter on Email id field
	By email1 = By.xpath("//input[@placeholder='Email Id']");
	// clear on mobile number field
	By mobile = By.xpath("//input[@name='mobilenumber']");
	// enter on mobile number field
	By mobile1 = By.xpath("//input[@name='mobilenumber']");
	//click the submit button
	By submit = By.xpath("//input[@value='Submit']");
	//Click by ok button
	By button = By.xpath("//button[normalize-space()='Ok']");
	

	
public UserUpdateProfilePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

//	public void ClickOnlogin() throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(login), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(login).click();
//		Thread.sleep(3000);
//	}
	public void clicktheSettingstype() throws InterruptedException {
		WebElement prof = testbase.waitForElement(Constants.driver.findElement(setting), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act1 = new Actions(driver);
		act1.moveToElement(prof).build().perform();
		Thread.sleep(3000);

	}
	
	public void clickonupdateprofileoption() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(update), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(update).click();
		       Thread.sleep(3000);
	}

	public void clearonfirstnamefield() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(first), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(first).clear();
		Thread.sleep(2000);
	}

	public void enteronfirstnamefield() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(first1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(first1).sendKeys("Anusha");
		Thread.sleep(2000);


	}
   public void clearonlastnamefield() throws InterruptedException, Exception {
	   testbase.waitForElement(Constants.driver.findElement(last), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(last).clear();;
		Thread.sleep(2000);
   }
	public void enteronlaststnamefield() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(last1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(last1).sendKeys("Gudugula");
		Thread.sleep(3000);
		
	}

	public void clearonemailidfield() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(email), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(email).clear();;
		Thread.sleep(2000);


	}

	public void enteronemailidfield() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(email1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(email1).sendKeys("gudugulaanusha@gmail.com");
		Thread.sleep(2000);
		
	}


	public void clearonmobilenumberfield() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(email1), TIMEOUT_WAIT, POOLING_WAIT);
        Constants.driver.findElement(mobile).clear();
        Thread.sleep(2000);
		
	}
	
	public void enteronmobilenumberfield() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(mobile1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mobile1).sendKeys("8247230983");
		Thread.sleep(4000);

	}
	public void clickthesubmitbuttonandclickbyok() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(submit), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(submit).click();
		Constants.driver.findElement(button).click();
		Thread.sleep(3000);

}
		
}
	
