package appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Test_007_Zoom {
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
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		  Thread.sleep(7000);
		
		  
		  
		  driver.findElement(AppiumBy.accessibilityId("open menu")).click();
		    driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"menu item drawing\"]"))
		        .click();
		    Thread.sleep(3000);
		    WebElement element = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"drawing screen\"]"));
		    Point centerOfElement = getCenterOfElement(element.getLocation(), element.getSize());

		    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		    PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
		    Sequence sequence = new Sequence(finger1, 1)
		        .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement))
		        .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
		        .addAction(new Pause(finger1, Duration.ofMillis(200)))
		        .addAction(finger1.createPointerMove(Duration.ofMillis(200),
		                                             PointerInput.Origin.viewport(), centerOfElement.getX() + 100,
		                                             centerOfElement.getY() - 100))
		        .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		    Sequence sequence2 = new Sequence(finger2, 1)
		        .addAction(finger2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement))
		        .addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
		        .addAction(new Pause(finger2, Duration.ofMillis(200)))
		        .addAction(finger2.createPointerMove(Duration.ofMillis(200),
		                                             PointerInput.Origin.viewport(), centerOfElement.getX() - 100,
		                                             centerOfElement.getY() + 100))
		        .addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		    driver.perform(Arrays.asList(sequence, sequence2));
		    
		
		
	
}
	
	 private static Point getCenterOfElement(Point location, Dimension size) {
		    return new Point(location.getX() + size.getWidth() / 2,
		                     location.getY() + size.getHeight() / 2);
		  }
}
