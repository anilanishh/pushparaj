package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_element_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
String s=driver.findElement(By.linkText("Books")).getText();
System.out.println(s);

	WebElement search_link=driver.findElement(By.id("small-searchterms"));
	
	String s1=search_link.getText();
	System.out.println(s1);
	
	//By.cssSelector("input[class='button-1 search-box-button']")
	
	WebElement x=driver.findElement(By.cssSelector("input[class='button-1 search-box-button']"));
	String z=x.getText();
	System.out.println(z);
	
WebElement r_link=driver.findElement(By.cssSelector("label[for='pollanswers-1']"));
String m=r_link.getText();
System.out.println(m);

String d=driver.findElement(By.cssSelector("input[type='radio']")).getText();
System.out.println(d);

String gt=driver.findElement(By.className("topic-html-content-header")).getText();
System.out.println(gt);
	}


}
