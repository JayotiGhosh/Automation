package Kayak;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("http://kayak.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section/div/div/div[1]/div[1]/div/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/ul/li[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section/div/div/div[1]/div[2]/div/button")).click();
	
		//increment passengers	

		/*driver.findElement(By.xpath("//div[@data-title=\"Round-trip\"]")).click();
  	driver.findElement(By.xpath("//*[contains(text(),'One-way')]")).click();
  	driver.findElement(By.xpath("//div[text()='1 Adult']")).click();*/
		
  driver.findElement(By.xpath("(//label[text()='Adults'])[2]/parent::div/parent::div/div[2]/div/div/div[3]/button")).click();

		//	driver.findElement(By.xpath("/html/body/div[80]/div[2]/div/div/div[1]/div/div[2]/div/div/div[3]/button")).click();
	Thread.sleep(1000);
		//somewhere on screen to focus out of prev selection
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[1]/div/h2")).click();
	
		//origin
	
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div[2]/form[1]/div[1]/div/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[2]/button")).click();
	
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[3]/input")).sendKeys("EWR");
	
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/ul/li/div[3]/div[2]")).click();
		
		//destination
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div[2]/form[1]/div[1]/div/div[1]/div/div[3]/div/div/div")).click();
	
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[1]/div[3]/input")).sendKeys("DEL");
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/ul/li[1]/div[3]/div[2]")).click();
		
		//click somewhere on page
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[1]/div/h2")).click();
		
		//date
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div[2]/form[1]/div[1]/div/div[1]/div/div[4]/div/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div[3]/div/div[3]/div/div[3]/div[3]/div[4]/div")).click();
			
		//search button
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div[2]/form[1]/div[1]/div/div[2]/button")).click();
	
		//Thread.sleep(3000);
		/*Set<String>winid = driver.getWindowHandles();
		driver.switchTo().window(winid.toArray()[0].toString());
		driver.close();
		driver.switchTo().window(winid.toArray()[1].toString());
		
		//Thread.sleep(3000);
		Set<String>winids = driver.getWindowHandles();
		driver.switchTo().window(winids.toArray()[1].toString());
		driver.close();
		driver.switchTo().window(winids.toArray()[0].toString());*/
		
		Thread.sleep(5000);
		//pop up ads close...full xpath
	//	driver.findElement(By.xpath("//*[@id=\"bxLE-dialog-close\"]")).click();
		driver.findElement(By.xpath("(//button[@aria-label='Close' and @class='Button-No-Standard-Style close ' and contains(@id,'dialog-close')]")).click();

		//another pop up close...full xpath
//		driver.findElement(By.xpath("/html/body/div[48]/div[3]/div/div/div/a/svg/use//svg")).click();
		//	driver.findElement(By.xpath("/html/body/div[79]/div[3]/div/button")).click();
		//	driver.findElement(By.xpath("//*[@id=\"aeBG-close\"]")).click();
	//	(//button[@aria-label='Close' and @class='Button-No-Standard-Style close ' and contains(@id,'dialog-close')])[
				
	//	-images-horizon-common-icon-x-icon
		//cheap air ad window close
		
		/*driver.findElement(By.xpath("/html/body/div[82]/div[3]/div/button/svg/use//svg")).click();
		driver.findElement(By.xpath("/html/body/div[81]/div[3]/div/div/div/a/")).click();
		*/
	}
	

}
