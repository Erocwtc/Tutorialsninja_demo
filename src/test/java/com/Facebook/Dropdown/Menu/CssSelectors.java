package com.Facebook.Dropdown.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssSelectors {
	public WebDriver driver;
	public Select select;

@BeforeMethod
public void openURL() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get("https://rediff.com");
}
@Test
public void clickOnSignIn() {
	driver.findElement(By.cssSelector("a.signin")).click();
	
	
}
@Test
public void loggingIntoAccount() throws Exception{
	driver.findElement(By.cssSelector("a.signin")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input.login1")).sendKeys("erikgonzalez891@gmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Erik1234");
}


@AfterMethod
public void exitingBrowser() {
	driver.quit();
}


	
	
}

