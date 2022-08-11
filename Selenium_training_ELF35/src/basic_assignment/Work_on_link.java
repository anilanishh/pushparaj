package basic_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work_on_link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 
 driver.manage().window().maximize();

 driver.get("http://demowebshop.tricentis.com/");
 driver.findElement(By.linkText("Register")).click();
 
 
 
 driver.findElement(By.id("FirstName")).sendKeys("Ajay TS");
 

 
 
 Thread.sleep(3000);

 
 driver.close();
		 }

}
