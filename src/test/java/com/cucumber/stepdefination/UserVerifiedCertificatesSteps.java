//package com.cucumber.stepdefination;
//import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
//import com.cucumber.PageObjects.LoginPageObjects;
//import com.cucumber.PageObjects.UserGeneratedCertificatesPageObjects;
//import com.cucumber.PageObjects.UserVerifiedCertificatesPageObjects;
//import com.cucumber.utility.TestContext;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class UserVerifiedCertificatesSteps {
//	TestContext testContext;
//	LoginPageObjects login;
//	UserVerifiedCertificatesPageObjects userverifiedcertificates;
//
//	public UserVerifiedCertificatesSteps(TestContext context) {
//		System.out.println("Started UserVerifiedCertificates steps ");
//		testContext = context;
//		login = testContext.getPageObjectManager().getlogin();
//		userverifiedcertificates = testContext.getPageObjectManager().getuserverifiedcertificates();
//	}
//	
//    @Given("^login by the valid Username and Password$")
//	public void login_by_the_valid_Username_and_Password() throws Throwable {
//		login.Logintoappln("DemoUser", "Admin@1");
//	}
//
//    @When("^click the reports type option$")
//    public void click_the_reports_type_option() throws Throwable {
//    	userverifiedcertificates.clickthereportstypeoption();
//    }
//
//    @Then("^click the verified certificates$")
//    public void click_the_verified_certificates() throws Throwable {
//    	userverifiedcertificates.clicktheverifiedcertificates();
//    }
//
//    @Then("^click by the send mail and click the ok$")
//    public void click_by_the_send_mail_and_click_the_ok() throws Throwable {
//    	userverifiedcertificates.clickbythesendmailandclicktheok();
//    }
//
//    @Then("^click on the download original certificates icon$")
//    public void click_on_the_download_original_certificates_icon() throws Throwable {
//    	userverifiedcertificates.clickonthedownloadoriginalcertificatesicon();
//    }
//
//    @Then("^click on the QR Code icon$")
//    public void click_on_the_QR_Code_icon() throws Throwable {
//    	userverifiedcertificates.clickontheQRCodeicon();
//    }
//
//    @Then("^select student checkbox again click by ok$")
//    public void select_student_checkbox_again_click_by_ok() throws Throwable {
//    	userverifiedcertificates.selectstudentcheckboxagainclickbyok();
//    }
//
//}