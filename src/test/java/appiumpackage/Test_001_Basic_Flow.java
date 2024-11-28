package appiumpackage;
import java.net.MalformedURLException;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.net.URL;
import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Test_001_Basic_Flow {

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException   {
		
		
		
		UiAutomator2Options options = new UiAutomator2Options()
				.setPlatformName("Android")
				.setUdid("fbeeb7ea")
				.setPlatformVersion("11")
				.setDeviceName("vivo 1951")
			    .setApp("E:\\Appium Notes\\APKs\\snapdeal.apk")
			    .setNoReset(false);
		
		 Thread.sleep(3000);
		 
		
		    
			 
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
	
		   Thread.sleep(5000);
		   
			 Thread.sleep(3000);
			 
			 Thread.sleep(3000);

		   WebElement English = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"English\"]"));
		   English.click();
			  Thread.sleep(5000);
			  
			  WebElement continuebutton = driver.findElement(AppiumBy.id("com.snapdeal.main:id/bottom_content_container"));
			  continuebutton.click();
			    Thread.sleep(5000);
			    
			 
			 
		
		   
			 // Scroll to Bottom
				  
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(10);"));

				Thread.sleep(1000);    

				System.out.println("It scrolled to the bottom");
				
				//driver.findElement(AppiumBy.androidUIAutomator(("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))"))); //scroll down to the element and click
			    
			    
	           WebElement category_button = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Category\"]"));
	           category_button.click();
               Thread.sleep(4000);


 
	    
	    

    System.out.println("Test Case Passed");
	    driver.quit();
	    
			    driver.removeApp("com.bigbasket.mobileapp");
			    System.out.println("App is uninstalled successfully");
			    
		   
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
