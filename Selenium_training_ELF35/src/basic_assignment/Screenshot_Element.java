
package basic_assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement un=driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or')]"));
File temp=un.getScreenshotAs(OutputType.FILE);
File dest=new File("./Screenshots/element.png");
try {
	FileHandler.copy(temp,dest);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
