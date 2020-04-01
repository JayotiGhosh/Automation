package WindowHandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Sign in")).click();
		
		System.out.println(driver.getWindowHandles());
		
		Set<String> winids = driver.getWindowHandles();
		driver.switchTo().window(winids.toArray()[1].toString());
		
		driver.findElement(By.id("identifierId")).sendKeys("jayapex@gmail.com"+Keys.ENTER);
		
		winids = driver.getWindowHandles();
		
		driver.switchTo().window(winids.toArray()[0].toString());
		System.out.println("Window 0" + " " +driver.getTitle());
		
		driver.findElement(By.linkText("For Work")).click();
		
		winids = driver.getWindowHandles();
		driver.switchTo().window(winids.toArray()[2].toString());
		
		driver.findElement(By.xpath("/html/body/header/div/div[1]/div[5]/ul/li[2]/a")).click();
		
	
		
		winids = driver.getWindowHandles();
		driver.switchTo().window(winids.toArray()[1].toString());
		System.out.println("Window 1" +" "+ driver.getTitle() + " " + "Sign in");
				
		driver.findElement(By.name("password")).sendKeys("abracadabra"+Keys.ENTER);
		
		driver.close();
		
		winids = driver.getWindowHandles();
		driver.switchTo().window(winids.toArray()[1].toString());
		driver.close();
		
		
	}

}
