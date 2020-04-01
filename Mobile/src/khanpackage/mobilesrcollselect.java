package khanpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class mobilesrcollselect {

	public static void main(String[] args) throws MalformedURLException  {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "samsung");
		cap.setCapability("platformName", "android");
	//	cap.setCapability("app", "/Users/jayot/Downloads/Khan Academy_v6.3.0_apkpure.com.apk");
		cap.setCapability("appPackage", "org.khanacademy.android");
		cap.setCapability("appActivity",  "org.khanacademy.android.ui.library.MainActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
	
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Search\"]")).sendKeys("Math");
	//	driver.findElement(MobileBy.AccessibilityId("Search tab")).sendKeys("Math");
		driver.hideKeyboard();
	
		Dimension d = driver.manage().window().getSize();
		//TouchAction act = new TouchAction(driver);
		

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		while(driver.findElements(MobileBy.AndroidUIAutomator("UiSelector().text(\"GMAT: Math 35\")")).size()==0)
		{
			driver.executeScript("mobile: shell",ImmutableMap.of("command", "input swipe "+(d.width/2)+" "+(d.height*3/4)+" "+(d.width/2)+" "+(d.height/4)));
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"GMAT: Math 35\")")).click();
		
		driver.closeApp();
		
	}

	}


