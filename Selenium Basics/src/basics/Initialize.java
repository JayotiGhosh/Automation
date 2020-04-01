package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// interface obj = new Class();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("http://magento.com");
	
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[8]/a/span[1]/i")).click();
		driver.findElement(By.id("email")).sendKeys("jayoti@hotmail.com");
	
		driver.findElement(By.id("pass")).sendKeys("Magento123");
		driver.findElement(By.name("send")).click();
		Thread.sleep(2000);
		String ID = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div[1]/div[1]/div/span")).getText();
		
		System.out.println(ID);
		if (ID.equals("ID: MAG005614506"))
		{
			System.out.println("TestCase Pass");
		}
			else
			{
				System.out.println("TestCase fail");
			}
		}
		
	}


