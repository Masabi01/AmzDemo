package com.Modules;
import com.Objects.*;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchitemandaddtocart {
	
	public  static WebDriver HomePageDetails(WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	    HomePageObjects.logo(driver).isDisplayed();
	    HomePageObjects.searchbox(driver).sendKeys("Apple");
	    HomePageObjects.searchbox(driver).sendKeys(Keys.ENTER);
	    HomePageObjects.smartphone(driver).click();
	    HomePageObjects.sortby(driver).click();
	    HomePageObjects.hightolow(driver).click();
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,3500)");
	    Thread.sleep(6000);
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", HomePageObjects.nextbutton(driver));
	    
	   // Actions action=new Actions(driver);
	   // action.moveToElement(HomePageObjects.nextbutton(driver)).perform();
	 //   action.click(HomePageObjects.nextbutton(driver));
	 //   HomePageObjects.nextbutton(driver).click();Thread.sleep(2000);
	    //
	    
	   
	    Thread.sleep(2000);
	    HomePageObjects.selectphone(driver).click();
	    Thread.sleep(2000);
	   String a= driver.getTitle();
	   System.out.println(a);
	  // driver.switchTo().window(a);
	   Thread.sleep(2000);
	    executor.executeScript("arguments[0].click();", HomePageObjects.addtocartbutton(driver));
		return driver;
}
}