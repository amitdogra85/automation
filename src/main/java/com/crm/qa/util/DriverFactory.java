package com.crm.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.base.TestBase;

public class DriverFactory
{

   private DriverFactory()
   {
	   TestBase base = new TestBase();
      //Do-nothing..Do not allow to initialize this class from outside
   }
   private static DriverFactory instance = new DriverFactory();

   public static DriverFactory getInstance()
   {
      return instance;
   }

   ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() // thread local driver object for webdriver
   {
      @Override
      protected WebDriver initialValue()
      {
  		String browserName = TestBase.prop.getProperty("browser");
  		
  		if(browserName.equals("chrome")){
  			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");	
  			return new ChromeDriver(); 
  		}
  		else if(browserName.equals("FF")){
  			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver");	
  			return new FirefoxDriver(); 
  		}
    	 
  		
        return null;
      }
   };

   public WebDriver getDriver() // call this method to get the driver object and launch the browser
   {
      return driver.get();
   }

   public void removeDriver() // Quits the driver and closes the browser
   {
      driver.get().quit();
      driver.remove();
   }
}