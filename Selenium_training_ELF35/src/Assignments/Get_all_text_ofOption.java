package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Get_all_text_ofOption extends Object {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/91805/Downloads/demo%20(1).html");
	WebElement dd=driver.findElement(By.xpath("//select[@id='standard_cars']"));
	Select s=new Select(dd);
	List<WebElement>options=s.getOptions();
//	for(int i=0;i<options.size();i++){
//		//WebElement r=driver.findElement(By.xpath("//select[@id='standard_cars']"));
//		String opts=options.get(i).getText();
//		System.out.println(opts);
//	}
	for(WebElement opt:options){
		//String s1=opt.getText();
		System.out.println(opt);
	}
	
}
}