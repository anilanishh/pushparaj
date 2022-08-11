package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demowebshop.tricentis.com/");
driver.findElement(By.linkText("Register")).click();
Thread.sleep(1000);

driver.findElement(By.id("gender-male")).click();
Thread.sleep(1000);

driver.findElement(By.id("FirstName")).sendKeys("Ajay");
Thread.sleep(1000);

driver.findElement(By.name("LastName")).sendKeys("TS");
Thread.sleep(1000);

driver.findElement(By.id("Email")).sendKeys("ajayts1988");
Thread.sleep(1000);

driver.findElement(By.name("Password")).sendKeys("12345");
Thread.sleep(1000);

driver.findElement(By.name("ConfirmPassword")).sendKeys("12345");
Thread.sleep(1000);

driver.findElement(By.id("register-button")).click();

Thread.sleep(3000);
driver.close();

	}

}
