package my_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91805/Downloads/demo%20(1).html");
		WebElement dd=driver.findElement(By.xpath("//select[@id='standard_cars']"));
		Select select=new Select(dd);
		List<WebElement>options=select.getOptions();
		for(int i=0;i<options.size();i++){
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath("(//input[@name='download'])[1]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("(//input[contains(@style,'width')])[3]")).sendKeys("android 11");
		

	}

}
