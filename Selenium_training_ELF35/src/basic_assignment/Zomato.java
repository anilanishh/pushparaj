package basic_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\myproject\\Selenium_training_ELF35\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.zomato.com");
		driver.findElement(By.xpath("//input[@placeholder='Bengaluru']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[contains(@placeholder,'restaurant')]")).sendKeys("Meghana Briyani");
		driver.findElement(By.xpath("//input[contains(@placeholder,'restaurant')]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//img[@src='https://b.zmtcdn.com/data/pictures/chains/1/50691/594b4d4942466a37d9bdd19ef659a77f_featured_v2.jpg?fit=around%7C108%3A108&crop=108%3A108%3B%2A%2C%2A']")).click();
		//System.out.println("\"hi\"");
	}

}
