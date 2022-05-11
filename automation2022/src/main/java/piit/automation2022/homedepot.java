package piit.automation2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homedepot {
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbens\\eclipse-workspace\\automation2022\\drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.homedepot.com/"); 
		   driver.manage().window().maximize();
		   driver.findElement(By.className("MyAccount")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.linkText("Register")).click();
		   driver.findElement(By.className("bttn--primary")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kamel@gmail.com");
		   driver.findElement(By.xpath("//*[@id='password-input-field']")).sendKeys("Hello@1988.");
		   driver.findElement(By.xpath("//*[@id='zipCode']")).sendKeys("123456");
		   driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("1234567890");
		   Thread.sleep(6000);
		   driver.findElement(By.xpath("//*[@class='u__inline-block'][1]")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.xpath("//*[@for='verify-phone-checkbox']")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.xpath("//*[@role='presentation'][1]")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.className("bttn__content")).click();
		   Thread.sleep(6000);
		   
		   
		   
		   
	}
	
}
		   
		   
		  
		 
		   
		
		   
		   
	


	
		
	

		


	
		
	
	


