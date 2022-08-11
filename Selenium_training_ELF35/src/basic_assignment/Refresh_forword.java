package basic_assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_forword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://www.zomato.com");
driver.navigate().refresh();
driver.navigate().back();
driver.navigate().forward();
driver.get("https://www.swiggy.com");
driver.close();
	}

}
