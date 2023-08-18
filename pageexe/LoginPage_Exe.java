package org.pageexe;

import org.app.BaseClass;
import org.locators.LoginPage_Locator;

public class LoginPage_Exe extends LoginPage_Locator{
	
	public static void user() {
		BaseClass.inputValue(LoginPage_Locator.userName(), "Raghu");
		
	}
	
	public static void pass() {
		BaseClass.inputValue(LoginPage_Locator.password(), "Aadhya@2905");
	}

	public static void loginButton() {
		BaseClass.clickValue(LoginPage_Locator.login());
	}
}
