package Test_case;

import org.testng.annotations.Test;

public class dependency {
@Test(dependsOnMethods = "LogIn")
public void AddtoCart() {
	System.out.println("product is added ");
}
@Test
public void LogIn() {
	System.out.println("Loged IN ");
}
@Test(dependsOnMethods = "AddtoCart")
public void RemoveCart() {
	System.out.println("product is Removed ");
}
}
