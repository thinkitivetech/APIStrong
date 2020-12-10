package com.ttaf.PageObject;

import com.ttaf.Library.AppLibrary;

public class LoginPage {

	
	public static String txtEmail = "id:txtEmail";
	public static String txtPassword = "id:txtPassword";
	public static String login = "id:kc-login";
	 public static String btnImport="id:btnImport";
	 public static String ProjectMenu="id:ProjectMenu";
	

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
	
	public NewAPIPage verification() throws Exception 
	{
		appLibrary.findElement(btnImport);
		
		appLibrary.findElement(ProjectMenu);
		System.out.println("Login successful");
		
		return new NewAPIPage(appLibrary);
		
	}



	
	
	

}
