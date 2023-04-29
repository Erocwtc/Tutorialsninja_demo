package com.Facebook.Dropdown.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Advancedxpath03_25_2023 {
	public WebDriver driver;
	public Select select;

	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://www.tutorialsninja.com/demo/");
		
		
}
	
	@Test
	public void clickonMyAccountLink() {
		driver.findElement(By.xpath("//@div[class = 'container']/descendant::span[contains(text(), ='My Account')]")).click();
	}
	
}