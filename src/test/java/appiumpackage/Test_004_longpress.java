package appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Test_004_longpress {

	
public static void main(String[] args) throws MalformedURLException, InterruptedException   {
		
		
		
		UiAutomator2Options options = new UiAutomator2Options()
				.setPlatformName("Android")
				.setUdid("fbeeb7ea")
				.setPlatformVersion("11")
				.setDeviceName("vivo 1951")
			    .setApp("E:\\Appium Notes\\APKs\\demoapp.apk")
			    .setNoReset(false);
		
		 Thread.sleep(5000);
		 
		
		    
			 
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		  Thread.sleep(3000);
		
		  
		  
		  // longpress
		  
		  driver.findElement(AppiumBy.xpath(".//*[@text='Views']")).click();
			 Thread.sleep(1000);
		    driver.findElement(AppiumBy.xpath(".//*[@text='Expandable Lists']")).click();
		    Thread.sleep(1000);
		    driver.findElement(AppiumBy.xpath(".//*[@text='1. Custom Adapter']")).click();
		    Thread.sleep(1000);
		    WebElement element = driver.findElement(AppiumBy.xpath(".//*[@text='People Names']"));
		    Thread.sleep(1000);
		    new Actions(driver).clickAndHold(element).perform();
		    Thread.sleep(1000);

 
}
}
