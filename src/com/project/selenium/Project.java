package com.project.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

public class Project {

	public static void main(String[] args) throws Exception {
		
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Cd\\chromedriver.exe");
      
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
      driver.get("http://automationpractice.com/index.php");
        
      Actions act = new Actions(driver);
       WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
       act.moveToElement(dress).build().perform();
       act.click(driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"))).build().perform();
       
      JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,750)","" );
       driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")).click();
       
      Thread.sleep(3000);
      
       WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
       quantity.clear();
       quantity.sendKeys("3");
     
       WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
       Select choose = new Select(size);
       choose.selectByVisibleText("L");
       
       driver.findElement(By.xpath("//a[@id='color_24']")).click();
       driver.findElement(By.xpath("//p[@id='add_to_cart']/button")).click();
    	
      TakesScreenshot ss = (TakesScreenshot) driver;
       File source = ss.getScreenshotAs(OutputType.FILE);
       File destination = new File ("C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Screenshot\\ss1.png");
       FileHandler.copy(source, destination);
      
      Thread.sleep(4000); 
       
       act.click(driver.findElement(By.xpath("//a[@title='Proceed to checkout']"))).click().perform();
       
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
       js1.executeScript("window.scrollBy(0,500)","" );
       
       TakesScreenshot ss2 = (TakesScreenshot) driver;
        File source1 = ss2.getScreenshotAs(OutputType.FILE);
        File destination1 = new File ("C:\\Users\\Muthu Mahendran\\eclipse-workspace\\SeleniumExamples\\Screenshot\\ss2.png");
        FileHandler.copy(source1, destination1);
       
       driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
       
       WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
       email.sendKeys("mahendranmuthu031194@gmail.com");
       WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
       pass.sendKeys("12345");
       driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
       
       JavascriptExecutor js2 = (JavascriptExecutor)driver;
       js2.executeScript("window.scrollBy(0,800)","" );
       
       Thread.sleep(4000); 
       
      driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
   
       
       
      
      
      
      
      
      
	}

}
