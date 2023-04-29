package automation03_02_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Actions_Frame {
	public WebDriver driver;
	
	@Test
	public void mouseActionsTest() throws Exception {

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable");
		
		//total #s of frames
		List<WebElement>totalFrames = driver.findElement(By.tagName("iframe"));
		System.out.println("total frames: " + totalFrames.size());


}
	
}
