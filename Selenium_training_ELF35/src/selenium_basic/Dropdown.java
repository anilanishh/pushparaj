package selenium_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/91805/Downloads/demo%20(1).html");
//driver.findElement(By.xpath("//select[@id='standard_cars']")).click();
WebElement opt1=driver.findElement(By.xpath("//select[@id='standard_cars']"));
Select opt=new Select(opt1);
List<WebElement>op=opt.getOptions();
for(WebElement o:op){
	String s=o.getText();
	System.out.println(s);
	Thread.sleep(1000);
}
//Select ss=new Select(dd);
//for(int i=1;i<dd.size();i++){
//	
//	
//}


	}

}
