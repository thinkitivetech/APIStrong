package com.ttaf.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.ttaf.Library.AppLibrary;
import com.ttaf.Library.TestBase;

public class NewAPIPage extends TestBase {

	public static String btnCreateTest = "id:btnCreateTest";
	public static String GETAPIUrl = "https://reqres.in/api/users?page=2";
	public static String POSTAPIUrl = "https://reqres.in/api/users";
	public static String puturl="https://reqres.in/api/users/2";
	public static String delurl="http://dummy.restapiexample.com/api/v1/employee/1";
	public static String apiname="id:apiName";
	public static String TestsMenu = "id:TestsMenu";
	public static String runapi = "id:run-api";
	public static String Home="xpath://a[text()='Home']";
	
	public static String testactionsdropdowntoggle = "id:test-actions-dropdown-toggle";


	public static String statuscode="xpath://span[@title='200']";
	
	public static String txtSearch = "id:txtSearch";
	public static String nodata="id:divNoData";
	
	
	public static String crapi = "id:Create_a_basic_request";
	
	public static String urlText = "id:urlText";
	public static String saveapi = "id:save-api";

	public static String httpMethodDropdown = "id:httpMethodDropdown";

	private AppLibrary appLibrary;
	
	public static String deleteapi="xpath://span[text()='Delete API']";
	
	public static String getapiname=" ";
	public static String postapiname=" ";
	public static String putapiname=" ";
	public static String delapiname=" ";
	
	public static String recentapi="xpath//a[@title='"+getapiname+"']";

	
	
	
	

	public NewAPIPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}

	public importPage GETAPI() throws Exception {
		appLibrary.clickElement(btnCreateTest);
		appLibrary.clickElement(crapi);
	

		appLibrary.enterText(urlText, GETAPIUrl);
		appLibrary.clickElement(saveapi);
		Thread.sleep(2000);
		getapiname=appLibrary.findElement(apiname).getAttribute("value");
		System.out.println("API name--------------"+getapiname);

		return new importPage(appLibrary);

	}

	public importPage POSTAPI() throws Exception {
		
		
			
		appLibrary.clickElement(btnCreateTest);
		appLibrary.clickElement(crapi);
		Select drp1 = new Select(appLibrary.findElement(httpMethodDropdown));
		Thread.sleep(2000);

		drp1.selectByVisibleText("POST");
		Thread.sleep(3000);

		appLibrary.enterText(urlText, POSTAPIUrl);
		Thread.sleep(2000);

		appLibrary.clickElement(saveapi);
		Thread.sleep(2000);
		String postapiname=appLibrary.findElement(apiname).getAttribute("value");

		return new importPage(appLibrary);

	}
	
	
	public importPage PUTAPI() throws Exception {
		Thread.sleep(3000);

		appLibrary.clickElement(btnCreateTest);
		appLibrary.clickElement(crapi);
		Select drp2 = new Select(appLibrary.findElement(httpMethodDropdown));
		Thread.sleep(2000);

		drp2.selectByVisibleText("PUT");

		appLibrary.enterText(urlText, puturl);
		appLibrary.clickElement(saveapi);
		Thread.sleep(2000);

		String putapiname=appLibrary.findElement(apiname).getAttribute("value");

		return new importPage(appLibrary);

	}
	public importPage DELAPI() throws Exception {
		Thread.sleep(3000);

		appLibrary.clickElement(btnCreateTest);
		appLibrary.clickElement(crapi);
		Select drp3 = new Select(appLibrary.findElement(httpMethodDropdown));
		Thread.sleep(2000);
		drp3.selectByVisibleText("DELETE");
	
		appLibrary.enterText(urlText, delurl);
		Thread.sleep(2000);

		appLibrary.clickElement(saveapi);
		Thread.sleep(2000);

		String delapiname=appLibrary.findElement(apiname).getAttribute("value");

		return new importPage(appLibrary);

	}
	
	public importPage RunAPI() throws Exception {
		Thread.sleep(2000);

		appLibrary.clickElement(TestsMenu);
		Thread.sleep(2000);

		appLibrary.enterText(txtSearch, this.getapiname);
		Thread.sleep(2000);

		appLibrary.findElement("xpath://i[@class='http-method-tag' and text()='GET']").click();;
		appLibrary.clickElement(runapi);
		appLibrary.clickElement(Home);
		Thread.sleep(2000);


		appLibrary.findElement(statuscode);
		System.out.println("API is created and ran passed");
		return new importPage(appLibrary);
		
	
	}
	
	public importPage DeleteApi() throws Exception {
		
		appLibrary.clickElement(recentapi);
		appLibrary.clickElement(testactionsdropdowntoggle);
		
		appLibrary.clickElement(deleteapi);
		appLibrary.clickElement(TestsMenu);
		Thread.sleep(2000);

		appLibrary.enterText(txtSearch, this.getapiname);
		Thread.sleep(2000);

		appLibrary.findElement(nodata);
		

		return new importPage(appLibrary);

		
	}
}
