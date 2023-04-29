package com.Facebook.Dropdown.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Morepractice {
	
	public static WebDriver driver; 
	public ChromeOptions options; 
	
	@BeforeMethod
	public void OpenUpUrl () {
		options = new ChromeOptions (); 
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.espn.com/");
	}
	
	@Test
	public void CheckNBAScores () {
	driver.findElement(By.xpath("//*[@id=\"submenu-button-submenu-sportsmenunba\"]")).click();
	}
	
}
	


	

