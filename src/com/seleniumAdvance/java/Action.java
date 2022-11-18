package com.seleniumAdvance.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		 Actions act = new Actions(driver);
	       WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	       act.moveToElement(dress).build().perform();
	       act.click(driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"))).build().perform();
	        
				
				
		
		
		

	}

}
