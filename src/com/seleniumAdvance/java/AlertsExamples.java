package com.seleniumAdvance.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExamples {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	
	Alert normalAlert = driver.switchTo().alert();
	
	normalAlert.accept();
	
	driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
	
	Alert confirmAlert = driver.switchTo().alert();
	
	confirmAlert.dismiss();
	
	driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
	
	Alert promptbox = driver.switchTo().alert();
	
	promptbox.sendKeys("Mahendran");
	
	promptbox.accept();
	
	driver.findElement(By.xpath("//button[@onclick='lineBreaks'()]"));
	
	Alert lineBreaks = driver.switchTo().alert();
	
	lineBreaks.getText();
	
	lineBreaks.accept();
	
	

	}

}
