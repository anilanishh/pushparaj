package basic_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='puma motorsport shoes men']")).click();

	}

}
//span[text()='orsport shoes']