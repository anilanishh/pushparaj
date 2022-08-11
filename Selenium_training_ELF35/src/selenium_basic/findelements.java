package selenium_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/91805/Downloads/demo%20(1).html");
List<WebElement>links=driver.findElements(By.tagName("label"));
for(int i=1;i<links.size();i++){
	WebElement s=links.get(i);
	s.getText();
}
	}

}
