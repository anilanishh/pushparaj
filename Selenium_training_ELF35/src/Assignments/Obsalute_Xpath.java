package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obsalute_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91805/Downloads/xpath1.html");
		driver.findElement(By.xpath("/html/body/div/input[1]")).sendKeys("Ajay");
		driver.findElement(By.xpath("/html/body/div/input[2]")).sendKeys("TS");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("TestYantra");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Banashankri");
	}

}
