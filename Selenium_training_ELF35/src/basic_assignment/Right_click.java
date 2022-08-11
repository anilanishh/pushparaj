package basic_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement Right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver);
		action.contextClick(Right_click).build().perform();
		WebElement copy=driver.findElement(By.xpath("//span[text()='Copy']"));
		action.moveToElement(copy).click().perform();
	}

}
