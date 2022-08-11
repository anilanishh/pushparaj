package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Subscribe_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demowebshop.tricentis.com/");
driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Computer");
driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
