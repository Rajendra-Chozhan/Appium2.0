package appiumpackage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableList;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Test_008_DragandDrop {

		
		
	public static void main(String[] args) throws MalformedURLException, InterruptedException   {
		
		
		UiAutomator2Options options = new UiAutomator2Options()
				.setPlatformName("Android")
				.setUdid("fbeeb7ea")
				.setPlatformVersion("11")
				.setDeviceName("vivo 1951")
			    .setApp("E:\\Appium Notes\\APKs\\android.wdio.native.app.apk")
			    .setNoReset(false);
		
		 Thread.sleep(5000);
		 
		
		    
			 
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		  Thread.sleep(3000);
		
			     

			
	   		
		  driver.findElement(By.xpath("//android.widget.TextView[@text=\"Drag\"]")).click();
			Thread.sleep(2000);
			
			WebElement sourceElement = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"drag-l2\"]/android.widget.ImageView"));
			
			WebElement destinationElement = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"drop-l2\"]/android.view.ViewGroup"));
			
			PointerInput option = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
			Sequence drag_drop = new Sequence(option, 0);
			
			drag_drop.addAction(option.createPointerMove(Duration.ZERO, PointerInput.Origin.fromElement(sourceElement),0, 0));
			drag_drop.addAction(option.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			drag_drop.addAction(option.createPointerMove(Duration.ofSeconds(5), PointerInput.Origin.fromElement(destinationElement),0, 0));
			drag_drop.addAction(option.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			
			driver.perform(ImmutableList.of(drag_drop));
			
			Thread.sleep(2000);
			
			System.out.println("executed code sucessfully");
			
			
			
			
			driver.quit();
			
			
		
			
     
			
			
		}

	
}
