package browser;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Native {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "samsung");
		cap.setCapability("platformName", "android");
		
		//if apk is provided..then write this code
	//	cap.setCapability("aap", "/Users/jayot/Downloads/Khan Academy_v6.3.0_apkpure.com.apk");
		
		//if apk not provided and aap already installed in ph or downloaded thru google play store, write this 
		cap.setCapability("appPackage", "org.khanacademy.android");
		cap.setCapability("appActivity",  "org.khanacademy.android.ui.library.MainActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button/android.widget.TextView")).click();
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
	//	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Search tab\"]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Search\"]")).sendKeys("Math");
		//	driver.findElement(MobileBy.AccessibilityId("Search")).sendKeys("Math");
		driver.hideKeyboard();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Math patterns\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Let's go\")")).click();
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText[1]")).click();
		

		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"1\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"3\")")).click();
		
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText[2]")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"3\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"7\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Check\")")).click();
		
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		driver.openNotifications();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Clear\")")).click();
	
	}

}
