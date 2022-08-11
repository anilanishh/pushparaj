package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Winowhandle2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("http://www.naukri.com/");

WebElement company=driver.findElement(By.xpath("//div[text()='Companies']"));
String parent=driver.getWindowHandle();
Actions action=new Actions(driver);
action.moveToElement(company).build().perform();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Unicorn']")).click();
Set<String>childID=driver.getWindowHandles();
for(String child:childID){
	driver.switchTo().window(child);
	System.out.println(driver.getTitle());

}
driver.switchTo().window(parent);


	}

}
