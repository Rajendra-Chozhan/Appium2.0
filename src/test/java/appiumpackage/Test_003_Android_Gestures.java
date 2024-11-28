package appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Test_003_Android_Gestures {

public static void main(String[] args) throws MalformedURLException, InterruptedException   {
		
		
		
		UiAutomator2Options options = new UiAutomator2Options()
				.setPlatformName("Android")
				.setUdid("fbeeb7ea")
				.setPlatformVersion("11")
				.setDeviceName("vivo 1951")
			    .setApp("E:\\Appium Notes\\APKs\\umang.apk")
			    .setNoReset(false);
		
		 Thread.sleep(5000);
		 
		
		    
			 
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		  Thread.sleep(7000);
		
		  
		  
		  

		  
		    
		    WebElement ele01 = driver.findElement(AppiumBy.accessibilityId("UMANG"));    
	  
	  driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
              "elementId", ((RemoteWebElement) ele01).getId(),
              "direction", "left",
              "percent", 0.99
              
      ));
	  Thread.sleep(5000);
	  
	    WebElement ele02 = driver.findElement(AppiumBy.accessibilityId("UMANG"));    
		  
		  driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
	              "elementId", ((RemoteWebElement) ele02).getId(),
	              "direction", "left",
	              "percent", 0.99
	              
	      ));
		  Thread.sleep(5000);
		  
		  
  WebElement ele03 = driver.findElement(AppiumBy.accessibilityId("UMANG"));    
		  
		  driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
	              "elementId", ((RemoteWebElement) ele03).getId(),
	              "direction", "right",
	              "percent", 0.99
	              
	      ));
		  Thread.sleep(5000);
		  
		  
   
		  
		  driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
	              "elementId", ((RemoteWebElement) ele02).getId(),
	              "direction", "right",
	              "percent", 0.99
	              
	      ));
		  Thread.sleep(5000);
		  
		  
		 WebElement skip = driver.findElement(AppiumBy.xpath("//*[@text=\"Skip for now\"]"));
		 skip.click();
			    Thread.sleep(5000);
			    
			
			
			   
					  WebElement loc = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"WHILE USING THE APP\"]"));
						 loc.click();
						    Thread.sleep(5000);
				
						    
						    // SCROLL INTO VIEW
						    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Documents You Might Need\"))"));
						       
					   
	    
				        
				        WebElement services_section = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Services\"]"));    
				        services_section.click();
				        Thread.sleep(5000);
				        WebElement ele3 = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"in.gov.umang.negd.g2c:id/iv_banner_image\"]"));    
						  
						  driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
//					                "left", 100, "top", 100, "width", 600, "height", 600,
					                "elementId", ((RemoteWebElement) ele3).getId(),
					                "direction", "left",
					                "percent", 0.99
					                
					        ));  Thread.sleep(3000);
						  

					        WebElement getstarted = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text =\"Get Started\"]"));    
					        getstarted.click();	
					        Thread.sleep(3000);
					        
					        WebElement mobilenumber = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text =\"Enter your Mobile Number\"]"));    
					        mobilenumber.sendKeys("8838392831");
					        Thread.sleep(3000);
					        WebElement MPIN = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text =\"Enter your MPIN\"]"));    
					        MPIN.sendKeys("761645");
					        Thread.sleep(3000);
					        
					        
					        WebElement login = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text =\"Login\"]"));    
					        login.click();	
					        Thread.sleep(6000);
					        

//					        WebElement never = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text =\"NEVER\"]"));    
//					        never.click();	
//					        Thread.sleep(6000);
					        
					        WebElement closepopup = driver.findElement(AppiumBy.id("in.gov.umang.negd.g2c:id/iv_close"));    
					        closepopup.click();	
					        Thread.sleep(6000);
					        
					        
					        
				       // driver.quit();
				        
//					  driver.removeApp("com.bigbasket.mobileapp");
//					    System.out.println("App is uninstalled successfully");
		   System.out.println("Test Case execution completed");
		   
		   

	
		
}}
