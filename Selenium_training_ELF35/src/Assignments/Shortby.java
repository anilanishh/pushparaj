package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shortby {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/books");
			WebElement dd=driver.findElement(By.id("products-orderby"));
			Select select=new Select(dd);
			List<WebElement>options=select.getOptions();
			for(WebElement d1:options){
				String sss=d1.getText();
				System.out.println(sss);
			}
//			for(int i=1;i<options.size();i++){
//				WebElement dd1=driver.findElement(By.id("products-orderby"));
//				Select select1=new Select(dd1);
//				Thread.sleep(2000);
//				select.selectByIndex(i);
//			}
	}
}
