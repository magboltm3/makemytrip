package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
//   web launcher
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		
		driver.manage().window().maximize();      
//    webdrive method
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("avcdefg");
		driver.findElement(By.name("pass")).sendKeys("magbolt3");
		driver.findElement(By.name("lgoin")).click();
		
    	String currenturl = driver.getCurrentUrl(); 
	    System.out.println(currenturl);
	
		String title = driver.getTitle();
		System.out.println(title);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		
		
		
		
		
	}

}
