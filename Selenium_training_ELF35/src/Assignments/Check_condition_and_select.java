package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_condition_and_select {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@href='/books']")).click();
	
	WebElement dd=driver.findElement(By.xpath("//select[@name='products-orderby']"));
	Select s=new Select(dd);
	List<WebElement> options=s.getOptions();
	for(int i=1;i<options.size();i++)
	{
		driver.findElement(By.xpath("//select[@name='products-orderby']"));

	String ss= options.get(i).getText();
	if(ss.equalsIgnoreCase("Name: A to Z"))
	{
		options.get(i).click();
	}
		
	}
		
	
	
	
}
}