package Driver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openga.selenium.firefox.FireFoxDriver;


public class DriverMethods {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("http://yahoo.com");
		System.out.println(driver.getCurrentUrl());
		driver.get("http://amazon.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_CONTROL);
		  Thread.sleep(50);
		  r.keyPress(KeyEvent.VK_T);
		  Thread.sleep(50);
		  r.keyRelease(KeyEvent.VK_T);
		  Thread.sleep(50);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		
		  driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		  driver.get("http://hotmail.com");
	}


}
