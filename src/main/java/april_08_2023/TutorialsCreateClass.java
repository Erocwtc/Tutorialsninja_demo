package april_08_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsCreateClass {

public WebDriver driver; 
	
		
		public void CreateLogin() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tutorialsninja.com/demo/");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText(null));
	
	

}}
