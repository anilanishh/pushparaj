
package basic_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/books']")).click();
			WebElement n=driver.findElement(By.xpath("//select[@name='products-orderby']"));
		Select s=new Select(n);
	List<WebElement>opt=s.getOptions();
	for(WebElement x:opt){
	System.out.print(x.getText());
	}
		
	}

}
