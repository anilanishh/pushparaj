package basic_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisaion_topic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.facebook.com/");
driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Ajay");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("TS");
WebDriverWait wait=new WebDriverWait(driver,10);

driver.findElement(By.xpath("//button[@type='submit']"));

	}

}
