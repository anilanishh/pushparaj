package my_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class fb_automation {
	@BeforeTest
	public void browser_launch() throws IOException {
		System.setProperty("webdriver.chromedriver", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		String path="./Test_Configaration/Test_configuration_property";
		FileInputStream fis=new FileInputStream(path);
		
		Properties pro=new Properties();
		pro.load(fis);
		
		driver.get("fb_url");
	}

}
