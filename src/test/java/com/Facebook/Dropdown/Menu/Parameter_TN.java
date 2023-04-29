package com.Facebook.Dropdown.Menu;

import org.openqa.selenium.WebDriver;

public class Parameter_TN {
	public WebDriver driver; 
	
	@Test
	@Parameters({"Browser" , "url" , "username" , "password"})

}
