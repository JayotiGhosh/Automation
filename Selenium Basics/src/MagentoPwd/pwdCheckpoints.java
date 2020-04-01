package MagentoPwd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pwdCheckpoints {

	public static void main(String[] args) throws InterruptedException{
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
		
			
		driver.findElement(By.id("password")).sendKeys(" ");
		
		driver.findElement(By.id("password-confirmation")).sendKeys("OMG123");
		
		if (!driver.findElement(By.id("agree_terms")).isSelected())
		{
			
			driver.findElement(By.id("agree_terms")).click();
		}
		
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/button/span")).click();
		
			
		String pwdcriteria = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println("password is : "+ pwdcriteria);
		
		String conf = driver.findElement(By.id("password-confirmation")).getAttribute("value");
		System.out.println("confirmation is  " + conf);
		
		String confmsg = driver.findElement(By.id("password-confirmation-error")).getText();
		System.out.println(confmsg);
		
		String pwdstrength = driver.findElement(By.id("password-strength-meter")).getText();
		System.out.println("pwd strenght msg is : "+ pwdstrength);
		
		String pwderror = driver.findElement(By.id("password-error")).getText();
		System.out.println("pwd error msg is : "+ pwderror);
		
			
// checking pwd criteria 
		
		if ( pwderror.equals("You have selected an invalid password. Your password must be at least 8 characters long and include characters from at least three of the following four categories: upper case letters, lower case letters, numbers, special characters."));
		{
			System.out.println("Invalid pwd entry critera TC PASS");
		}
//checking weak pwd
		
		if (pwdstrength.equals("Password Strength: Weak"))
		{
			System.out.println("pwd strength Weak pwd TC PASS");
		}
		else
		{
			System.out.println("Try again");
		}
		
//matching both pwd fields
		
		
		if (!pwdcriteria.equals(conf) && confmsg.contentEquals("Please enter the same value again."));
		{
	
			System.out.println("pwd not match TC PASS");
		}
		
// checking blank pwd	
		
		if (pwdcriteria.isBlank() && pwderror.contentEquals("This is a required field"));
			{
			System.out.println("Blank pwd TC PASS");
			}
		}
		
		
	
	}


