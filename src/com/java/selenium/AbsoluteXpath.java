package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		WebElement email = driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input"));
		
		email.sendKeys("maggu");
	}

}
