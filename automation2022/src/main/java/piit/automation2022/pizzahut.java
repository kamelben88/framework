package piit.automation2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pizzahut {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbens\\eclipse-workspace\\automation2022\\drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.pizzahut.com/"); 
		   driver.manage().window().maximize();
		   driver.findElement(By.className("MuiButton-label")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.xpath("//*[@class='jss10'][1]")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.xpath("//*[@class='btn btn-lg btn-link ph-titlecase ng-binding ng-scope'][1]")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.linkText("Order Now")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.xpath("//*[@class='ph-d-icon ph-text-align']")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.name("deliveryStreet")).sendKeys("12240 s st strong line");
		   Thread.sleep(6000);
		   driver.findElement(By.id("address2")).sendKeys("1440");
		   Thread.sleep(6000);
		   driver.findElement(By.id("city")).sendKeys("olathe");
		   Thread.sleep(6000);
		   driver.findElement(By.id("state")).sendKeys("kansas");
		   Thread.sleep(6000);
		   driver.findElement(By.id("zip-input")).sendKeys("66062");
		   Thread.sleep(6000);
		   driver.findElement(By.xpath("//*[@class='btn btn-primary btn-block continue-guest']")).click();
		   Thread.sleep(6000);
		   
		   
		   
		   
		   
	}

}
