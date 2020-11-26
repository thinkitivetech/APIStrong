package com.ttaf.PageObject;

import com.ttaf.Library.AppLibrary;

public class LoginPage {

	
	public static String txtEmail = "id:txtEmail";
	public static String txtPassword = "id:txtPassword";
	public static String login = "id:kc-login";

	AppLibrary appLibrary;

	public LoginPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}
	
	
	public NewAPIPage login(String email, String password) throws Exception 
	{
	    
		appLibrary.enterText(txtEmail, email);
		appLibrary.enterText(txtPassword, password);
		appLibrary.clickElement(login);
		return new NewAPIPage(appLibrary);


	}
	


	
	
	

}
