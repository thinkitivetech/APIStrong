package com.db.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ttaf.Library.AppLibrary;
import com.ttaf.Library.TestBase;
import com.ttaf.PageObject.LoginPage;
import com.ttaf.PageObject.NewAPIPage;

public class LoginTest extends TestBase {
	

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("Logintest");
	}

	@Test()
	public void LoginTest() throws Exception {

		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		
		NewAPIPage  np = new LoginPage(appLibrary).login("test24nov@mailinator.com", "test12");

	}


}
