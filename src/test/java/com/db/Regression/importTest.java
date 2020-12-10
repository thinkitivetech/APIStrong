package com.db.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ttaf.Library.AppLibrary;
import com.ttaf.Library.TestBase;
import com.ttaf.PageObject.ExposedUrlPage;
import com.ttaf.PageObject.LoginPage;
import com.ttaf.PageObject.NewAPIPage;
import com.ttaf.PageObject.importPage;

public class importTest extends TestBase {
	

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("Logintest");
	}

	@Test()
	public void importTest() throws Exception {

		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		NewAPIPage  np1 =new LoginPage(appLibrary).login("test24nov@mailinator.com", "test12");

		ExposedUrlPage  np2 = new importPage(appLibrary).importColl();
		ExposedUrlPage  np3 = new importPage(appLibrary).verification();
		
	}


}
