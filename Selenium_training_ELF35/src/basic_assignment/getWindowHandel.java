package basic_assignment;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class getWindowHandel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91805/Downloads/demo%20(1).html");
		Set <String> windowID=driver.getWindowHandles();
		
		for(String window:windowID){
//System.out.println(window);
			driver.switchTo().window(window);
			driver.findElement(By.xpath("//a[contains(text(),'Webshop')]")).click();
			driver.close();

		}
		driver.switchTo().window(arg0)
		
		
//		String Parentwindow=driver.getWindowHandle();
//		System.out.println(Parentwindow);
//
//		driver.findElement(By.linkText("Webshop")).click();
//		
//		String Childwindow=driver.getWindowHandle();
//		System.out.println(Childwindow);
		
	}

}
