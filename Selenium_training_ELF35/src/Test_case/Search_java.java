package Test_case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Search_java {
	@Test
	public void java() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("java");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
			WebElement result=driver.findElement(By.xpath("//strong[@class='result']"));
			if(result.getText().contains("No products"))
			{
			driver.findElement(By.xpath("//input[@id='As']")).click();
			WebElement dd=driver.findElement(By.xpath("//Select[@id=\"Cid\"]"));
			Select select=new Select(dd);
			select.selectByIndex(1);        
			
		WebElement dd1=driver.findElement(By.xpath("//Select[@id=\"Mid\"]"));
		Select select1=new Select(dd1);
		select1.selectByIndex(0); 
		driver.findElement(By.xpath("(//input[@name='Sid'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='button-1 search-button']")).click();
				
			}
	}

}
