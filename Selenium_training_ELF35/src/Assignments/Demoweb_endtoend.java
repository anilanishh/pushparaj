package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoweb_endtoend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Thread.sleep(3000);
		//driver.navigate().back();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
		Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	String p1=driver.findElement(By.xpath("(//span[@class='product-subtotal'])[1]")).getText();
//	System.out.println(p1);
	Thread.sleep(5000);

	String p2=driver.findElement(By.xpath("(//span[@class='product-subtotal'])[2]")).getText();
//	System.out.println(p2);
//	p1=p1.trim();
//	p2=p2.trim();
	double cost1=Double.parseDouble(p1);
//	System.out.println(cost1);
	double cost2=Double.parseDouble(p2);
//	System.out.println(cost2);
	Thread.sleep(4000);
	
	
	if(cost1>cost2){
		driver.findElement(By.xpath("(//input[@name='removefromcart'])[1]")).click();
		
	}
	else{
		driver.findElement(By.xpath("(//input[@name='removefromcart'])[2]")).click();
	}
	
	driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	String price=driver.findElement(By.xpath("//span[@class='product-subtotal']")).getText();
System.out.println(price);
	}

}
