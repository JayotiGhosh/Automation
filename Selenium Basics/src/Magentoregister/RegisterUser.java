package Magentoregister;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RegisterUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("http://magento.com");
		
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[8]/a/span[1]/i")).click();
		driver.findElement(By.id("register")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Jay");
		driver.findElement(By.id("lastname")).sendKeys("G");
		driver.findElement(By.id("email_address")).sendKeys("jayapex@gmail.com");
		
		Select company = new Select (driver.findElement(By.id("company_type")));
		company.selectByValue("tech_partner");
		
		Select role = new Select(driver.findElement(By.id("individual_role")));
		role.selectByIndex(1);
		
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("United States");
		
			
		driver.findElement(By.id("password")).sendKeys("Magento123");
		driver.findElement(By.id("password-confirmation")).sendKeys("Magento123");
		
		if (!driver.findElement(By.id("agree_terms")).isSelected())
		{
			
			driver.findElement(By.id("agree_terms")).click();
		}
		
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/button/span")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/fieldset[4]/div/div/div[1]/div[1]/div/div/iframe")));
		
		driver.findElement(By.className("recaptcha-checkbox-border")).click();
		driver.switchTo().defaultContent();
		
	}
	}
	
	
	


