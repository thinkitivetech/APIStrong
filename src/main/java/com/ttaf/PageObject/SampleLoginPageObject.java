package com.ttaf.PageObject;

import com.ttaf.Library.AppLibrary;

public class SampleLoginPageObject {

	AppLibrary appLibrary;

	public String userNameInput = "id:txtUserName";
	public String passInput = "id:txtPassword";
	public String loginBtn = "id:btnLogin";

	public SampleLoginPageObject(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}

}
