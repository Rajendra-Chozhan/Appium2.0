package appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableList;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Test_009_tap_SequenceMethod {
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
		
			     

			
	   		
		 WebElement element= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Views\"]"));
		 
			Thread.sleep(2000);
			
		
			
			PointerInput option = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
			Sequence tap = new Sequence(option, 0);
			
			//Tap method
			
					
					tap.addAction(option.createPointerMove(Duration.ZERO, PointerInput.Origin.fromElement(element),0, 0));
					tap.addAction(option.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
					tap.addAction(option.createPointerMove(Duration.ofSeconds(5), PointerInput.Origin.fromElement(element),0, 0));
					tap.addAction(option.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
					
					driver.perform(ImmutableList.of(tap));
			
			Thread.sleep(2000);
			
			System.out.println("executed code sucessfully");
			
			
			
			
			driver.quit();
			
			
		
			
     
	}
}
