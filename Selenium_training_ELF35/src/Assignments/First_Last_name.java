package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Last_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.className(class="text-box single-line"));
		//class="text-box single-line"
		driver.findElement(By.id("FirstName")).sendKeys("Ajay");
		driver.findElement(By.id("LastName")).sendKeys("TS");
		
		
		
		
	

		driver.close();
	}

}


