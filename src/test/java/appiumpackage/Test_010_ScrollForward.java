package appiumpackage;
import io.appium.java_client.screenrecording.CanRecordScreen;
import org.apache.commons.codec.binary.Base64;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Test_010_ScrollForward {


	

		public static void main(String[] args) throws InterruptedException, IOException   {
			
			
			
			UiAutomator2Options options = new UiAutomator2Options()
					.setPlatformName("Android")
					.setUdid("fbeeb7ea")
					.setPlatformVersion("11")
					.setDeviceName("vivo 1951")
				    .setApp("E:\\Appium Notes\\APKs\\umang.apk")
				    .setNoReset(false);
			
			 Thread.sleep(5000);
			 
			
			    
				 
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			  Thread.sleep(5000);
			  ((CanRecordScreen)driver).startRecordingScreen();
			  String timestamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()).replaceAll(":", "-");
			    
			    WebElement ele01 = driver.findElement(AppiumBy.accessibilityId("UMANG"));
			    Thread.sleep(3000);
			    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollForward()"));
				Thread.sleep(3000);
				
				 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollBackward()"));
					Thread.sleep(3000);
					
					 WebElement skip = driver.findElement(AppiumBy.xpath("//*[@text=\"Skip for now\"]"));
					 skip.click();
						    Thread.sleep(5000);
						    
			
						
						   
								  WebElement loc = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"WHILE USING THE APP\"]"));
									 loc.click();
									    Thread.sleep(5000);
									    
									    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollForward()"));
										Thread.sleep(3000);
										 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollForward()"));
											Thread.sleep(3000);
											 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollForward()"));
												Thread.sleep(3000);
												 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollForward()"));
													Thread.sleep(3000);
												
														
																								    									
														 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollBackward(3)"));						
														System.out.println("Scroll done");
		 
														
									
													       String media = ((CanRecordScreen) driver).stopRecordingScreen();
													       String dirPath =   "C:\\Users\\ADMIN\\eclipse-workspace\\Appium2.0\\Appium2.0\\Videos";
													       File videoDir = new File(dirPath);
													       FileOutputStream stream = null;
													       
													    try {
													      stream = new FileOutputStream(videoDir + File.separator +timestamp+ ".mp4");
													            stream.write(Base64.decodeBase64(media));
													            stream.close();

													        } catch (Exception e) {

													        } finally {
													            if(stream != null) {
													                stream.close();
													            }
													        }
														
														    
													
													            driver.quit();}}
													      
													        
													            
																
													        
		
													    

									
		  
		