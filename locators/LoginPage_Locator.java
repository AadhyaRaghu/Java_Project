package org.locators;

import org.app.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage_Locator extends BaseClass{
	
	public static WebElement userName() {
		return driver.findElement(By.id("username"));
	}
	
	public static WebElement password() {
		return driver.findElement(By.id("password"));
		
	}
	public static WebElement login() {
		return driver.findElement(By.id("login"));
	}

}
