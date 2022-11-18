package com.java.selenium;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		TakesScreenshot ss =(TakesScreenshot) driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Screenshot\\ss.png");
		
		FileHandler.copy(source, destination);
		
		
		
		

	}

}
