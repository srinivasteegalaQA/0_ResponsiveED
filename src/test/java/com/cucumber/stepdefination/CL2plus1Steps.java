package com.cucumber.stepdefination;


import com.cucumber.PageObjects.CL2plus1PageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CL2plus1Steps {
	TestContext testContext;
	LoginPageObjects login;
	CL2plus1PageObjects CL2plus1;

	public CL2plus1Steps(TestContext context) {
		System.out.println("Started CL2plus1 Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		CL2plus1 = testContext.getPageObjectManager().getcl2plus1();
	}

	@Given("^Login employee with valid credentials$")
	public void Launch_Nspira_Portal() throws Throwable {
		login.Logintoappln("NSP7036607", "Global12$");
	}

	@When("^Click on Apply Casual Leave$")
	public void Click_On_Apply_Casual_Leave() throws Throwable {
		CL2plus1.ClickOnApplyCasualLeave();
	}

	@Then("^Apply leave for two days$")
	public void Apply_Leave_For_Two_Days() throws Throwable {
		CL2plus1.ApplyLeaveForTwoDays();

	}

	@Then("^Apply leave for immediate nextday$")
	public void Apply_Leave_For_Immediate_Nextday() throws Throwable {
		CL2plus1.AgainClickOnCasualLeave();
		CL2plus1.ApplyLeaveForImmediateNextday();

	}
}
