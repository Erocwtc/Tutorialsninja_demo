package com.java.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class morepractice03122023 {
	public static WebDriver driver;
	public static ChromeOptions options;
	
	
	public static void main(String[] args) {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	options.addArguments("--remote-allow-origins = https://rediff.com");
	driver = new ChromeDriver(options);
	driver.get("https://rediff.com");
	
	

	}

}
