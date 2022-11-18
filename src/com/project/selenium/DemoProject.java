package com.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoProject {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");
	      
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.get("http://automationpractice.com/index.php");
	     
	      Actions act = new Actions (driver);
           WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
           act.moveToElement(dress).build().perform();
           act.click(driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"))).build().perform();
           
           JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(0,750)","");
	        driver.findElement(By.xpath("//*[@id=\\\"center_column\\\"]/ul/li/div/div[2]/h5/a")).click();
	        
//	        Thread.sleep(3000);
//	           
//	        WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
//	        quantity.clear();
//	        quantity.sendKeys("3");
//	    		  
//	    		  
//	    		  
	    		  
	    		  
	        	  
	    		  
	    		  
	    		  
	    		  
	    		  
	}
}
