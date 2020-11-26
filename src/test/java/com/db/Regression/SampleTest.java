package com.db.Regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ttaf.Library.AppLibrary;
import com.ttaf.Library.TestBase;

public class SampleTest extends TestBase {

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("addSponsorTest");
	}

	@Test()
	public void addSponsorTest() throws Exception {

		appLibrary.getDriverInstance();
		appLibrary.launchApp();
		
	}

}