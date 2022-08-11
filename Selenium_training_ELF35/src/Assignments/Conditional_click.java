package Assignments;

import org.apache.xpath.operations.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");

		driver.findElement(By.cssSelector("input[class='search-box-text ui-autocomplete-input']")).sendKeys("java");
		String f=driver.findElement(By.cssSelector("input[type='submit']")).getAttribute("type");
		if(f.equalsIgnoreCase("submit"))
		{
			driver.findElement(By.cssSelector("input[type='submit']")).click();
		}
		Thread.sleep(3000);
		String ng=driver.findElement(By.cssSelector("strong[class='result']")).getText();
		System.out.println(ng);
	}

}
