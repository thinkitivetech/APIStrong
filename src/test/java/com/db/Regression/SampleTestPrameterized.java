package com.db.Regression;

import java.io.File;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ttaf.Library.AppLibrary;
import com.ttaf.Library.TestBase;

public class SampleTestPrameterized extends TestBase {

	@DataProvider(name = "SponsorData")
	public String[][] getDataFromExcel() throws Exception {
		String str[][] = appLibrary.readExcel("Resources" + File.separator + "SampleTestData.xls", 0);
		return str;
	}

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("addSponsorTest");
	}

	@Test(dataProvider = "SponsorData")
	public void addSponsorTest(String paramA, String paramB, String paramC, String paramD, String paramE,
			String exeIndicator) throws Exception {

		System.out.println(paramA);
		System.out.println(paramB);
		System.out.println(paramC);
		System.out.println(paramD);
		System.out.println(paramE);
		System.out.println(exeIndicator);
		appLibrary.getDriverInstance();
		appLibrary.launchApp();

	}

}