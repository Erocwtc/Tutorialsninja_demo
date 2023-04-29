package com.Facebook.Dropdown.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_Dropdown_Menu {

	public WebDriver driver;
	public Select select;
	
	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://facebook.com");
	}
	
	@Test
	public void facebookDropDownMenu() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'Create new account account')]")).click();
		Thread.sleep(1000);
		
	}
	
}
