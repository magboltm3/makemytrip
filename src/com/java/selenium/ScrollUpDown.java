package com.java.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		driver.get("http://automationpractice.com/index.php");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		  js.executeScript("window.scrollBy(0,500)","");
		  
		  js.executeScript("window.scrollBy(0,-500)","");
		
		
		

	}

}
