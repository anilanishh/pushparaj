package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demowebshop.tricentis.com/");
driver.findElement(By.id("small-searchterms")).sendKeys("acb");

driver.findElement(By.className("button-1 search-box-button")).click();
	}

}
