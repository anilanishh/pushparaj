package selenium_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91805/Downloads/demo%20(1).html");
		WebElement dd=driver.findElement(By.xpath("//select"));
		
		Select s=new Select(dd);
		List<WebElement>opt=s.getOptions();
		for(int i=1;i<opt.size();i++)
		{
			WebElement d=driver.findElement(By.tagName("select"));
		Select ss=new Select(d);
		ss.selectByIndex(i);
			
		}
		
		
		
	}

}
