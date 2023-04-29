package april_08_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateRediffEmail {
	
	public WebDriver driver; 
	public SoftAssert softassert = new SoftAssert();
		
		@Test
		public void CreateLogin() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rediff.com/");
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Erik Gonzalez");
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("ErikGonzalez891");
			driver.findElement(By.className("btn_checkavail")).click();
			String actualAvailabilityMessage = driver.findElement(By.id("check_availability")).getText();
			String expectedAvailabilityMessage = "Yippie! The ID you've chosen is available.";
			softassert.assertTrue(actualAvailabilityMessage.contains(expectedAvailabilityMessage));
			driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("Erik1234");
			driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("Erik1234");
			driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("e.gonzalez1092@outlook.com");
			driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("3017875980");
			
			select = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
			select.selectByVisibleText("03");
		
			}

}
