package basic_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
Actions action=new Actions(driver);

WebElement drag=driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
WebElement drop=driver.findElement(By.xpath("//div[text()='United States']"));
action.dragAndDrop(drag, drop).perform();

WebElement drag1=driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
WebElement drop1=driver.findElement(By.xpath("(//div[text()='Italy'])"));
action.dragAndDrop(drag1, drop1).perform();

WebElement drag2=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
WebElement drop2=driver.findElement(By.xpath("(//div[text()='Spain'])"));
action.dragAndDrop(drag2, drop2).perform();

WebElement drag3=driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
WebElement drop3=driver.findElement(By.xpath("(//div[text()='Sweden'])"));
action.dragAndDrop(drag3, drop3).perform();
	}

}
