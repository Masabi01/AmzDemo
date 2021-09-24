package com.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Modules.*;

public class SearchItemandAddtoCart {
	
	public WebDriver driver;
	
	//@BeforeClass
//	  @Parameters("browser")
	 
//	  public void beforeTest(String browser) throws MalformedURLException {
//		if (browser.equalsIgnoreCase("chrome")) 
//		{
	      //  WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\I318299\\Documents\\Selenium\\chromedriver.exe");
		//	 driver = new ChromeDriver();
//		}
//	}
	
	@Test(priority=0)
	public  void HomePageTestcase() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\I318299\\Documents\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		 searchitemandaddtocart.HomePageDetails(driver);
		//return driver;
	}

}
