package com.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HomePageObjects {
	public static WebElement logo(WebDriver driver)
	{
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
	return logo;
	}
	
	
	public static WebElement searchbox(WebDriver driver)
	{
	WebElement searchtxt=driver.findElement(By.id("twotabsearchtextbox"));
	return searchtxt;
	}
	
	public static WebElement smartphone(WebDriver driver)
	{
	WebElement phone=driver.findElement(By.xpath("//span[text()='Smartphones']"));
	return phone;
	}
	
	public static WebElement sortby(WebDriver driver)
	{
	WebElement dropdown=driver.findElement(By.xpath("//span[text()='Sort by:']"));
	return dropdown;
	}
	
	public static WebElement hightolow(WebDriver driver)
	{
	WebElement dropdownbutton=driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_2\"]"));
	return dropdownbutton;
	}
	
	public static WebElement nextbutton(WebDriver driver)
	{
	//WebElement nxtbutton=driver.findElement(By.linkText("Next"));
	WebElement nxtbutton=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[29]/span/div/span/a[3]"));
	return nxtbutton;
	}
	
	public static WebElement selectphone(WebDriver driver)
	{
		//WebElement fbutton=driver.findElement(By.xpath("//input[value()='Find Flights']"));
	 WebElement fbutton=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/span/a/div/img"));
	 return fbutton;
	}
	
	public static WebElement addtocartbutton(WebDriver driver)
	{
		//WebElement fbutton=driver.findElement(By.xpath("//input[value()='Find Flights']"));
	 WebElement fbutton=driver.findElement(By.xpath("//span[text()='Add to Cart]"));
	 return fbutton;
	}
	
	
}
