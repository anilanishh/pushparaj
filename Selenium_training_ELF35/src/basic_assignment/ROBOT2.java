package basic_assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ROBOT2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/91805/Downloads/demo%20(1).html");
		Thread.sleep(3000);
		WebElement c_file=driver.findElement(By.xpath("//input[@id='resume']"));
		Actions action=new Actions(driver);
		action.moveToElement(c_file).click().build().perform();
		Thread.sleep(3000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_B);

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_SHIFT);

		for(int i=0;i<3;i++){
			Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		robot.mouseMove(730, 700);
		Thread.sleep(2000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

	}

}
