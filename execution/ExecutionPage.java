package org.execution;

import org.pageexe.LoginPage_Exe;

public class ExecutionPage extends LoginPage_Exe{
	 public static void main(String[] args) {
		browserLaunch("https://adactinhotelapp.com/");
		user();
		pass();
		loginButton();
	}
	

}
