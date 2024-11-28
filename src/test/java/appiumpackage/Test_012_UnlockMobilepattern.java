package appiumpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class Test_012_UnlockMobilepattern {
	

	public static Properties prop;
	public static void main(String[] args) throws InterruptedException, IOException {
		

		Logger logger =  LogManager.getLogger(Test_012_UnlockMobilepattern.class.getName());

		FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Appium2.0\\Appium2.0\\src\\test\\resources\\Log4j.properties");
		prop = new Properties();
		prop.load(fis);
		
		
		
		
		UiAutomator2Options options = new UiAutomator2Options()
				.setPlatformName("Android")
				.setUdid("RZ8NB0DSJWF")
				.setPlatformVersion("12")
				.setDeviceName("Galaxy F41")
			    .setApp("E:\\Appium Notes\\APKs\\demoapp.apk")
			    .setNoReset(false);
		
		
	
		    options.setCapability("unlockType", "pattern");
		    options.setCapability("unlockKey", "23658");
		
			 Thread.sleep(1000);
		    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		     
		        System.out.println(((AndroidDriver) driver).isDeviceLocked());
		        ((AndroidDriver) driver).unlockDevice();
		        
		  		  
				  
				  // longpress
				  
				  driver.findElement(AppiumBy.xpath(".//*[@text='Views']")).click();
					 Thread.sleep(1000);
					    
					    logger.info("Views clicked");
				    driver.findElement(AppiumBy.xpath(".//*[@text='Expandable Lists']")).click();
				    logger.info("Lists clicked");
				    Thread.sleep(1000);
				    driver.findElement(AppiumBy.xpath(".//*[@text='1. Custom Adapter']")).click();
				    Thread.sleep(1000);
				    logger.info("Adapter clicked");
				    WebElement element = driver.findElement(AppiumBy.xpath(".//*[@text='People Names']"));
				    Thread.sleep(1000);
				    new Actions(driver).clickAndHold(element).perform();
				    Thread.sleep(3000);
				    
				    ((AndroidDriver) driver).lockDevice();
				    
				    logger.info("Test Execution done");


	}


}
