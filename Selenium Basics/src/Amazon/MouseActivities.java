package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
		act.click(driver.findElement(By.linkText("Start here."))).perform();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("jayoti");
		driver.findElement(By.id("ap_email")).sendKeys("jayoti@hotmail.com");
		
	}

}
