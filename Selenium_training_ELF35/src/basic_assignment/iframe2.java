package basic_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("file:///C:/Users/91805/Downloads/iframe.html");
Thread.sleep(12000);
driver.switchTo().frame("frame1");
driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
driver.findElement(By.xpath("//a[text()='COVID']")).click();

	}

}
