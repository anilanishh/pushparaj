package Test_case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register {
	@Test
public void registerm() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	driver.findElement(By.xpath("//input[@name='Gender']")).click();
	driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Ajay");
	driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("TS");
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("ajay@1998");
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("789456");
	driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("789456");
driver.findElement(By.xpath("//input[@value='Register']")).click();
driver.close();
	
}
}
