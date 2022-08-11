package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snowcity_assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://snowcityblr.com/contact-us/");
		Thread.sleep(8000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='icon navigate-icon']")).click();
		
	}

}
