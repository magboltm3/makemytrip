package com.selenium.exp;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.seleniumAdvance.java.Robot;

public class Examples {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		
		search.sendKeys("Dhoni");
		
		Robot robot = new Robot();
		
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		Thread.sleep(3000);

        driver.quit();
        
        
	}

}
