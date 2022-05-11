package piit.automation2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowserdriver {
static WebDriver driver;



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbens\\eclipse-workspace\\automation2022\\drivers\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.navigate().to ("https://www.amazon.com");
   driver.manage().window().maximize();
   driver.navigate().back();
   Thread.sleep(6000);
   driver.navigate().forward();
	}

}
