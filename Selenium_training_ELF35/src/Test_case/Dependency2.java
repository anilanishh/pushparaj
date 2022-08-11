package Test_case;

import org.testng.annotations.Test;

public class Dependency2 {
@Test                                   //(dependsOnMethods ="DemoRegister" )
public void DemoSearch() {
	System.out.println("executing search");
}
@Test(groups = "Smoke_Testing")
public void Demologin() {
	System.out.println("executing login");
}
@Test(groups = "Smoke_Testing")
public void DemoRegister() {
	System.out.println("executing Register");
}
}
