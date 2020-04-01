package google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div[2]/div/div[1]/a/h3")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("SeleniumHQ Browser Automation"))
		{
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		driver.quit();
	}

}
