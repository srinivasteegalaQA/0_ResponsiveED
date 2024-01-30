package com.cucumber.managers;

import org.apache.log4j.xml.DOMConfigurator;



import com.cucumber.PageObjects.CL2plus1PageObjects;
import com.cucumber.PageObjects.CreateUserPageObj;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserUpdateProfilePageObjects;
import com.cucumber.PageObjects.UserWelcomeTextPageObjects;
import com.cucumber.utility.Constants;
import com.cucumber.utility.Log;

public class PageObjectManager {

	// private WebDriver driver;

	private LoginPageObjects login;
	
	private CreateUserPageObj user;

	private Log log;

	private CL2plus1PageObjects CL2plus1;

	
	private UserUpdateProfilePageObjects updateprf;
	
	
    private UserWelcomeTextPageObjects welcometext;

   


    
    public PageObjectManager() {
		// this.driver = driver;
		DOMConfigurator.configure("log4j.xml");
	}

	public LoginPageObjects getlogin() {
		if (login == null) {
			login = new LoginPageObjects(Constants.driver);
		}
		return login;
	}

	public CreateUserPageObj getcreateUser() {
		if (user == null) {
			user = new CreateUserPageObj(Constants.driver);
		}
		return user;
	}

	
	public CL2plus1PageObjects getcl2plus1() {
		if (CL2plus1 == null) {
			CL2plus1 = new CL2plus1PageObjects(Constants.driver);
		}
		return CL2plus1;
	}

	

	public UserUpdateProfilePageObjects getupdate() {
		if (updateprf == null) {
			updateprf = new UserUpdateProfilePageObjects(Constants.driver);
		}
		return updateprf;
	}
	
	public UserWelcomeTextPageObjects getwelcometext() {
		if (welcometext == null) {
			welcometext = new UserWelcomeTextPageObjects(Constants.driver);
		}
		return welcometext;
}
	
}
