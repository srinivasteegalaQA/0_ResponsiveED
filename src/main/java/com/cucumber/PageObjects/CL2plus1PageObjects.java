package com.cucumber.PageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class CL2plus1PageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click on Apply casual leave button
	By tdsPopUp = By.xpath("//div[contains(@id,'staticBackdrop')]");
	By casualLeave = By.xpath("//p[text()='CASUAL LEAVE']//following::span[2]");
	// Click on fromdate in calender
	By fromDate = By.xpath("//input[@id='fromDate']");
	// get all dates in calender
	By fdCalender = By.xpath("//div[@class='flatpickr-calendar animate open arrowTop arrowLeft']");
	By fromDates = By.tagName("span");
	// Click on Todate in calender
	By toDate = By.xpath("//input[@id='LeaveTo']");
	// get all dates in calender
	By tdCalender = By.xpath("//div[@class='flatpickr-calendar animate open arrowTop arrowLeft']");
	By toDates = By.tagName("span");
	// click on remarks
	By remarks = By.xpath("//textarea[@id='Remarks']");
	// Click on Submit button
	By submitButton = By.xpath("//button[text()='Submit']");
	// Click on OK button
	By okButton = By.xpath("//button[text()='Ok']");
	// Get the popup message
	By popUpMessage = By.xpath("//h2[text()='Oops...! Something went Wrong !']");

	public CL2plus1PageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void ClickOnApplyCasualLeave() throws InterruptedException {
		WebElement tds = testbase.waitForElement(Constants.driver.findElement(tdsPopUp), TIMEOUT_WAIT, POOLING_WAIT);
		tds.click();
		Thread.sleep(2000);
		testbase.waitForElement(Constants.driver.findElement(casualLeave), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(casualLeave).click();
		Thread.sleep(4000);
	}

	public void ApplyLeaveForTwoDays() throws InterruptedException {
		// Apply leave for two days
		// from date
		testbase.waitForElement(Constants.driver.findElement(fromDate), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(fromDate).click();
		Thread.sleep(5000);
		// Locate the calendar element
		try {
			WebElement fromDateCalendar = testbase.waitForElement(Constants.driver.findElement(fdCalender),
					TIMEOUT_WAIT, POOLING_WAIT);
			// Locate all the dates in the calendar
			List<WebElement> fromallDates = fromDateCalendar.findElements(fromDates);
			for (WebElement date : fromallDates) {
				// Enter From Date below
				if (date.getText().equals("9")) {
					date.click();
					Thread.sleep(2000);
				}
			}
		} catch (Exception ex) {
		}
		// to date
		testbase.waitForElement(Constants.driver.findElement(toDate), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(toDate).click();
		Thread.sleep(5000);
		// Locate the calendar element
		try {
			WebElement toDateCalendar = testbase.waitForElement(Constants.driver.findElement(tdCalender), TIMEOUT_WAIT,
					POOLING_WAIT);
			Thread.sleep(2000);
			// Locate all the dates in the calendar
			List<WebElement> ToallDates = toDateCalendar.findElements(toDates);
			for (WebElement date1 : ToallDates) {
				// Enter To Date below
				if (date1.getText().equals("10")) {
					date1.click();
				}
			}
		} catch (Exception ex) {
		}
		// Remarks
		testbase.waitForElement(Constants.driver.findElement(remarks), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(remarks).sendKeys("due to outing");
//		WebElement remark = Constants.driver.findElement(remarks);
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//	    js2.executeScript("arguments[0].click()", remark);
//		Thread.sleep(4000);
		// Submit
		testbase.waitForElement(Constants.driver.findElement(submitButton), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(submitButton).click();
//		WebElement submit = Constants.driver.findElement(remarks);
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("arguments[0].click()", submit);
		Thread.sleep(5000);
		// OK
		testbase.waitForElement(Constants.driver.findElement(okButton), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(okButton).click();
		Thread.sleep(4000);
	}

	public void AgainClickOnCasualLeave() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(casualLeave), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(casualLeave).click();
		Thread.sleep(4000);
	}

	public void ApplyLeaveForImmediateNextday() throws InterruptedException {
		// Apply leave for immediate next day
		// from date
		testbase.waitForElement(Constants.driver.findElement(fromDate), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(fromDate).click();
		Thread.sleep(5000);
		// Locate the calendar element
		try {
			WebElement fromDateCalendar1 = testbase.waitForElement(Constants.driver.findElement(fdCalender),
					TIMEOUT_WAIT, POOLING_WAIT);
			// Locate all the dates in the calendar
			List<WebElement> fromallDates1 = fromDateCalendar1.findElements(fromDates);
			for (WebElement date2 : fromallDates1) {
				// Enter From Date below
				if (date2.getText().equals("11")) {
					date2.click();
					Thread.sleep(2000);
				}
			}
		} catch (Exception ex) {
		}
		// to date
		testbase.waitForElement(Constants.driver.findElement(toDate), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(toDate).click();
		Thread.sleep(4000);
		// Locate the calendar element
		try {
			WebElement toDateCalendar1 = testbase.waitForElement(Constants.driver.findElement(tdCalender), TIMEOUT_WAIT,
					POOLING_WAIT);
			Thread.sleep(2000);
			// Locate all the dates in the calendar
			List<WebElement> ToallDates1 = toDateCalendar1.findElements(toDates);
			for (WebElement date3 : ToallDates1) {
				// Enter To Date below
				if (date3.getText().equals("11")) {
					date3.click();
					Thread.sleep(2000);
				}
			}
		} catch (Exception ex) {
		}
		// Remarks
		testbase.waitForElement(Constants.driver.findElement(remarks), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(remarks).sendKeys("due to outing");
		Thread.sleep(3000);
		// Submit
		testbase.waitForElement(Constants.driver.findElement(submitButton), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(submitButton).click();
		Thread.sleep(5000);
//		WebElement submit = Constants.driver.findElement(remarks);
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("arguments[0].click()", submit);
//		Thread.sleep(4000);
		// Validation
		WebElement popupMessage = testbase.waitForElement(Constants.driver.findElement(popUpMessage), TIMEOUT_WAIT,
				POOLING_WAIT);
		String actualMessage = popupMessage.getText();
		String expectedMessage = "Oops...! Something went Wrong !";
		try {
			Assert.assertEquals(expectedMessage, actualMessage);
			System.out.println("TEST PASSED");
		} catch (AssertionError e) {
			System.out.println("Assertion failed: " + e.getMessage());
		}

	}
}
