package Test_case;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo_fb {
@Test
public void fb_link_in_demo() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com/");
	String parent=driver.getWindowHandle();
	
	Actions action=new Actions(driver);
	WebElement fb=driver.findElement(By.linkText("Facebook"));
	action.moveToElement(fb).click().build().perform();
	Set<String>children=driver.getWindowHandles();
	for(String child:children) {
		driver.switchTo().window(child);
		if(driver.getTitle().contains("NopCommerce")) {
			Thread.sleep(5000);
			//
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ajay");
			//Thread.sleep(3000);
			driver.close();
			
		}
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		driver.close();
	}
	
}
}
