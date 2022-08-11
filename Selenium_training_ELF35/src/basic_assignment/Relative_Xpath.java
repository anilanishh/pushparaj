package basic_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91805/Downloads/xpath.html");
		
		driver.findElement(By.xpath("//input[@type='Username']")).sendKeys("Ajay");
		driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[text()='SignOn']")).click();
		
		
		
		//input[@type='Username']

	}

}
