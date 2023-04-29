package com.java.code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Classpractie {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		options.setPageLoadStrategy(PageLoadStrategy.NONE);

		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(0));

		driver.get("http://tutorialsninja.com/demo");

		driver.findElement(By.linkText("My Account")).click();



		driver.findElement(By.linkText("Login")).click();

		

		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");

	

		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");

	

		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();



		driver.findElement(By.linkText("Logout")).click();
	}

}
