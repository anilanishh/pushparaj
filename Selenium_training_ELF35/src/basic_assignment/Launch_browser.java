package basic_assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.instagram.com");
 String url=driver.getCurrentUrl();
 System.out.println(url);
 String title=driver.getTitle();
 System.out.println(title);
	}

}
