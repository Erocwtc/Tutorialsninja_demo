package automation03_02_2023;




	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard_mouse {

	public WebDriver driver;

	@Test

	public void mouseActionsTest() throws Exception {

	driver = new FirefoxDriver();

	driver.manage().window().maximize();

	driver.get("https://browserstack.com");

	Actions action = new Actions(driver);

	WebElement getADemoButton = driver.findElement(By.xpath("//div[@class= 'relative']/preceding::button[1]"));

	action.moveToElement(getADemoButton).perform();

	WebElement getStartedFreeButton1 = driver.findElement(By.id("signupModalButton"));

	action.moveToElement(getStartedFreeButton1).contextClick().perform();

	driver.navigate();

	Thread.sleep(2000);

	WebElement getStartedFreeButton = driver.findElement(By.id("signupModalButton"));

	action.moveToElement(getStartedFreeButton).click().perform();

	}

	}

