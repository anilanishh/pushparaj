package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("http://demowebshop.tricentis.com/");
String ParentID=driver.getWindowHandle();
driver.findElement(By.xpath("//a[text()='Facebook']")).click();
Set<String> childID=driver.getWindowHandles();
for(String child:childID){
	driver.switchTo().window(child);
	Thread.sleep(3000);
	driver.close();
	
}


driver.switchTo().window(ParentID);
//driver.close();

	}

}
