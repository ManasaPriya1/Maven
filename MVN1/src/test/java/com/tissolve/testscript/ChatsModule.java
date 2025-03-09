package com.tissolve.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tissolve.generic.BaseClass;

public class ChatsModule extends BaseClass {
	@Test
	public void demo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Reporter.log(driver.getTitle(), true);
		driver.quit();
	}
	
}
