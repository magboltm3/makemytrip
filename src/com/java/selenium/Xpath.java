package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div/div/div/form/div[1]/div/input"));
		
		email.sendKeys("MAGGU");
		
    	WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		
		password.sendKeys("abcdefg");
//		
//		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
//		
//		login.click();
//		
		

	}

}
