package basic_assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_msg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
WebElement button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
Actions action=new Actions (driver);
Thread.sleep(2000);
action.doubleClick(button).build().perform();
Thread.sleep(2000);
Alert ala=driver.switchTo().alert();
String alert_text=ala.getText();
System.out.println(alert_text);
if(alert_text.equalsIgnoreCase("You double clicked me.. Thank You..")){
	ala.accept();
}
	}

}
