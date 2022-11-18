package com.selenium.exp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;

public class NewDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(4000);
		driver.quit();
		
		
		
	}

}
