package com.seleniumAdvance.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        
        WebElement name1 = driver.findElement(By.xpath("//input[@type='text']"));
        name1.sendKeys("Muthu Mahendran");
        
        WebElement name2 = driver.findElement(By.xpath("//input[@id='lastName']"));
        name2.sendKeys("Balamurugan");
        
        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
    	email.sendKeys("magboltm3@gmail");	   
        
    	WebElement contactno = driver.findElement(By.xpath("//input[@id='userNumber']"));
    	contactno.sendKeys("1234567890");
    	
    	WebElement subject = driver.findElement(By.xpath("(//input)[9][@type='text']"));
    	subject.sendKeys("Demo Testing");
        
    	WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
    	address.sendKeys("Mumbai");		
        

	}
}
