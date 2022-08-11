package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");

String f=driver.findElement(By.cssSelector("input[type='submit']")).getAttribute("class");
System.out.println(f);
	}

}
