package appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

public class Test_005_Tap {

	public static void main(String[] args) throws MalformedURLException, InterruptedException   {
		
		 

	
		UiAutomator2Options options = new UiAutomator2Options()
				.setPlatformName("Android")
				.setUdid("fbeeb7ea")
				.setPlatformVersion("11")
				.setDeviceName("vivo 1951")
			    .setApp("E:\\Appium Notes\\APKs\\androiddemo.apk")
			    .setNoReset(false);
		
		 Thread.sleep(5000);
		 
		
		    
			 
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
	
		 WebElement openMenu = driver.findElement(AppiumBy.accessibilityId("open menu"));
		    tap(driver, openMenu);
	    System.out.println("Double done");
	    
		
	  }

	private static void tap(AndroidDriver driver, WebElement openMenu) {
		
		
	}

	
	
	}
