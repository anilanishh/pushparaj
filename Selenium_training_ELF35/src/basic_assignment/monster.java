package basic_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class monster {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		WebElement job_search=driver.findElement(By.xpath("//a[text()='All Jobs']"));
		Actions action=new Actions(driver);
		action.moveToElement(job_search).build().perform();
		Thread.sleep(2000);
		WebElement Jobs_by_Skills=driver.findElement(By.xpath("(//a[text()='Jobs by Skills'])"));
		action.moveToElement(Jobs_by_Skills).build().perform();
		Thread.sleep(2000);
		WebElement java_jobs= driver.findElement(By.xpath("(//a[@href='https://www.monsterindia.com/search/java-jobs'])[2]"));
		Thread.sleep(2000);

		action.moveToElement(java_jobs).click().build().perform();
		
	}

}
