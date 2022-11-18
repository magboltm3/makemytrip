package com.seleniumAdvance.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
//		Robot robo = new Robot();
//		
//		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
//		
//		robo.keyRelease(KeyEvent.VK_PAGE_UP);
	}


	


	}


