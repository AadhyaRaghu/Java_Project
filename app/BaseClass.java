package org.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver = null;
	
	public static void browserLaunch(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void inputValue(WebElement element, String Data)
	{
		element.sendKeys(Data);
	}

	public static void clickValue(WebElement element) {
		element.click();
	}
}