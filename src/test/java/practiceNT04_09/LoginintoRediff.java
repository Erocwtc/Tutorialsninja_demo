package practiceNT04_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginintoRediff {
	
	public WebDriver driver; 
	public SoftAssert softassert = new SoftAssert();
		
		@Test
		public void CreateLogin() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rediff.com/");
			driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
			

}
