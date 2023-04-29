package automation03_02_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook03_25_2023 {

	@BeforeMethod
	
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}
	
	@Test 
	public void dropDownTest() throws Exception {
		driver.findElement(By.xpath("//select[@id = 'month']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select/option[@value = '12' and text()='Dec']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id= 'day']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select/option[@value= '14']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id = 'year']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select/option[@value = '1987']")).click();
		Thread.sleep(2000);
	}
	
	

}
