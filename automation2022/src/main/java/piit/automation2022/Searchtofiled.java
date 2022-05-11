package piit.automation2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchtofiled {
static WebDriver driver ;
	public static void sendKeys(String string) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbens\\eclipse-workspace\\automation2022\\drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.navigate().to ("https://www.expedia.com/");
		   driver.manage().window().maximize();
		   
	}

}
