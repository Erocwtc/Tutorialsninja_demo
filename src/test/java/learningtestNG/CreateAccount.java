package learningtestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccount {

		public static WebDriver driver;
		public ChromeOptions options;
		
		@BeforeMethod
		public void openBrowser()   {
			options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER) ;
			options.addArguments("--start-maximized");
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get("http://www.tutorialsninja.com/demo/");
			
		};
		
		@Test
		
		public void registerforaccount() {
			
			driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]")).click();
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.xpath("//input[@id=\"input-firstname\"]")).sendKeys("Erik");
	
		
		
}}
