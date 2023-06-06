package com.example.utils;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class BaseClass {
	
	public static AndroidDriver<AndroidElement> driver;
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException{
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ExampleEmulator");
		//driver=new AndroidDriver<>(new URL ("http://127.0.0.1:4723/wd/hub"), capabilities);
		//driver=new AndroidDriver<>(new URL ("http://127.0.1.1:4723/wd/hub"), capabilities);
		driver=new AndroidDriver<>(new URL ("http://localhost:4723/wd/hub"), capabilities);
		return driver;
		
	};
		
	public static void setUp() throws MalformedURLException {
			
		driver=capabilities();	
		
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JSWaiter.setDriver(driver);
		//driver.manage().window().setSize(new Dimension(1366, 768));
		//driver.manage().window().fullscreen();
		//driver.manage().deleteAllCookies();
		//driver.rotate(ScreenOrientation.LANDSCAPE);
		driver.get("https://mobile.example.com");
				
	}
	public static void tearDown() throws InterruptedException {
		driver.close();
		Thread.sleep(5000);
	}
}