package basic_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		driver.findElement(By.cssSelector("input[name='Gender']")).click();
		driver.findElement(By.cssSelector("input[class='text-box single-line']")).sendKeys("ajay");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("TS");
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("ajayts1998@gmail.com");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("12345");;
		driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("12345");;
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		//driver.findElement(By.cssSelector(""));

	}

}
