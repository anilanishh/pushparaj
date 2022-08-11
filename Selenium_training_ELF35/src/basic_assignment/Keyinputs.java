package basic_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyinputs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Actions action=new Actions(driver);
action.sendKeys(Keys.PAGE_DOWN).perform();
action.sendKeys(Keys.PAGE_UP).perform();

action.moveToElement(driver.findElement(By.xpath("//input[@value='Search store']"))).click().sendKeys("computer").build().perform();
Thread.sleep(2000);
	WebElement opt=driver.findElement(By.xpath("//a[text()='Build your own computer']"));
	Thread.sleep(2000);
	action.moveToElement(opt).click().build().perform();
	}

}

