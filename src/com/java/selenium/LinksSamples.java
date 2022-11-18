package com.java.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksSamples {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
	    driver.navigate().back();
	    Thread.sleep(3000);
	    driver.findElement(By.partialLinkText("Find where am")).click();
	   
	    driver.navigate().back();
	    
	    
	    String attributename = driver.findElement(By.partialLinkText("Find where am")).getAttribute("href");
	    
	    System.out.println(attributename);
	    
	    String title = driver.getTitle();
        
	    System.out.println(title);
	    
	    if(title.contains("404")){
	    
	     System.out.println("it is  a broken link");
	    }
    else {	    	    	
    	System.out.println("it is not a broken link");
	     }
        List<WebElement> nooflinks = driver.findElements(By.tagName("a"));
         
        System.out.println(nooflinks.size());

		
		
		
		
		

	}

}
