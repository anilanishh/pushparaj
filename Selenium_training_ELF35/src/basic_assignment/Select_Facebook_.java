package basic_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Facebook_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ajay");
	WebElement dd=	driver.findElement(By.xpath("//select[@aria-label='Day']"));
	Select s=new Select(dd);
	s.selectByValue("2");
	
	WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
	Select d=new Select(month);
	d.selectByValue("Jul");
	
	WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
	Select g=new Select(year);
	
	g.selectByValue("1998");
	}

}
