package piit.automation2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	static	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	 
		 
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbens\\eclipse-workspace\\automation2022\\drivers\\chromedriver.exe");
			   driver=new ChromeDriver();
			   driver.navigate().to ("https://www.amazon.com");
			   driver.manage().window().maximize();
	          WebElement Searchicon=driver.findElement(By.id("nav-search-submit-button"));
	               Searchicon.click();
			WebElement Searchfiledtxt=  driver.findElement(By.name("filed-keywords"));
	          Searchfiledtxt.sendKeys("computer");    
	        WebElement linktxt= driver.findElement(By.linkText("Registry"));
	                linktxt.click();	        
     WebElement searchtoclick= driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
     Thread.sleep(6000);
      searchtoclick.click();
      Searchtofiled.sendKeys("desktop");
      searchtoclick.click();
      
	
      
     
	
	}
}



		
	


