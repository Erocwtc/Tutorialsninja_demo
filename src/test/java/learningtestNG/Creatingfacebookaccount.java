package learningtestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Creatingfacebookaccount {
	
	public static WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void openBrowser()   {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER) ;
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://www.facebook.com");	}
		
		@Test
		public void registerforfacebook() {
			driver.findElement(by.
		
		
		

}}
