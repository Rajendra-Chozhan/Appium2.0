package appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

public class Test_002_Emulator {

public static void main(String[] args) throws MalformedURLException, InterruptedException   {
		
		
		
		UiAutomator2Options options = new UiAutomator2Options()
				.setPlatformName("Android")
				.setUdid("emulator-5554")
				.setPlatformVersion("11")
				.setDeviceName("Pixel 6")
			    .setApp("E:\\Appium Notes\\APKs\\snapdeal.apk")
			    .setNoReset(false);
		
		 Thread.sleep(3000);
		 
		
		    
			 
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
	
		   Thread.sleep(5000);
		   
		 

		   WebElement English = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"English\"]"));
		   English.click();
			  Thread.sleep(5000);
			  
			  WebElement continuebutton = driver.findElement(AppiumBy.id("com.snapdeal.main:id/bottom_content_container"));
			  continuebutton.click();
			    Thread.sleep(5000);
		
		   
		   
		   
		   WebElement category_button = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Category\"]"));
		   category_button.click();
	    Thread.sleep(4000);

		
	    Dimension size = driver.manage().window().getSize();
	    int startX = size.getWidth() / 2;
	    int startY = size.getHeight() / 2;
	    int endX = startX;
	    int endY = (int) (size.getHeight() * 0.3);
	    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
	    Sequence sequence = new Sequence(finger1, 1)
	        .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
	        .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
	        .addAction(new Pause(finger1, Duration.ofMillis(200)))
	        .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
	        .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	
	    driver.perform(Collections.singletonList(sequence));
	    
	    Thread.sleep(5000);
	  


	    
//	    WebElement Beautybutton = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Beauty & Personal Care\"]"));
//	    Beautybutton.click();
//	    Thread.sleep(4000);
//		   
//	    
//	
//	    
//	    
//	    
//	    WebElement wintercare = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Winter Care\"]"));
//	    wintercare.click();
//	    Thread.sleep(5000);
	    
	    
	    // SCROLL INTO ELEMENT
// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"HOME\")")).click();
	    
	  
//	    
//	 
//	    RemoteWebElement carousel = (RemoteWebElement) driver.findElement((AppiumBy.xpath("//android.widget.TextView[@text=\"Action - Black Men's Sports Running Shoes\"]")));
//	    driver.executeScript("gesture: swipe", ImmutableMap.of("elementId", carousel.getId(), "percentage", 50, "direction", "up"));
	    
	    

    System.out.println("Test Case Passed");
	    driver.quit();
//		    
//			   // driver.removeApp("com.bigbasket.mobileapp");
//			   // System.out.println("App is uninstalled successfully");
//			    
//			   
		
}

private static Function presenceOfElementLocated(By accessibilityId) {
	// TODO Auto-generated method stub
	return null;
}
	
	
		
}
