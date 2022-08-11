package Test_case;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Subscribe {
	WebDriver driver;
	@BeforeTest
public void click() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public String geturll() throws InterruptedException, IOException
	{
		String filepath="./File_Configaration/Test_configuration_properties";
		FileInputStream fis=new FileInputStream(filepath);
		
		Properties pro=new Properties();
		pro.load(fis);
		String url=pro.getProperty("Url");
		return url;
	}
	
	
	public void main() throws Exception {	
	driver.get("url");
	driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("ajay");
	driver.findElement(By.xpath("//input[@name='NewsletterEmail']")).click();
	
	}
	@AfterTest
	public void end() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
	

}
