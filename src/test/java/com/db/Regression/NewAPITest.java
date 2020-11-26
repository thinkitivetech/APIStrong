package com.db.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ttaf.Library.AppLibrary;
import com.ttaf.Library.TestBase;
import com.ttaf.PageObject.LoginPage;
import com.ttaf.PageObject.NewAPIPage;
import com.ttaf.PageObject.importPage;

public class NewAPITest extends TestBase{
	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("New API test");
	}

	@Test()
	public void NewAPITest() throws Exception {

		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		appLibrary.Register();
		
		importPage  np = new NewAPIPage(appLibrary).GETAPI();
		Thread.sleep(2000);
		importPage  np1 = new NewAPIPage(appLibrary).RunAPI();
		importPage  np2 = new NewAPIPage(appLibrary).DeleteApi();

		//importPage  np1 = new NewAPIPage(appLibrary).POSTAPI();
		//importPage  np2 = new NewAPIPage(appLibrary).PUTAPI();
		//importPage  np3 = new NewAPIPage(appLibrary).DELAPI();
		

		
		//new NewAPIPage(appLibrary).login("test24nov@mailinator.com", "test12");

		//new LoginPage(appLibrary).login("test24nov@mailinator.com", "test12");

	}
	

	
	

}
