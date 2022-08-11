package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='pollanswers-1']")).click();
driver.findElement(By.cssSelector("input[value='Vote']")).click();
	}

}
