package com.usa.loging;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uspslonginfuntiontest {

	public static void main(String[] args) {
		// open browser
       WebDriver driver = new FirefoxDriver();
		
	//how to sent URL to open ups
       
      // driver.get("https://www.ups.com//");
       
       
       // how to go your application
       
      // driver.navigate().to("https://www.usps.com//");
       driver.navigate().back();
      // driver.navigate().forward();
      // driver.navigate().refresh();
       
       driver.navigate().to("https://www.ups.com/lasso/login");
       driver.findElement(By.className("ups-appPage")).click();; 
    	  
       driver.findElement(By.xpath("//*[@id='ups-navItems']/ul/li[1]/a"));
       
       driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("tech123$");;
       
       
       driver.findElement(By.xpath(".//*[@id='pwd']")).click();
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS)	; 
       driver.quit();
      System.out.println("test passed"); 
       
       
	}
	
	
	

}
