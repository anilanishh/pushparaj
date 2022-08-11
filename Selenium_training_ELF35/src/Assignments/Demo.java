package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Ajay");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("TS");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
	}

}
