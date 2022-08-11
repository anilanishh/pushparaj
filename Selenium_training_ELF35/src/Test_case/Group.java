package Test_case;

import org.testng.annotations.Test;

public class Group {
@Test(groups = "Smoke")
public void login() {
	System.out.println("Enter UN and PWD");
}
@Test(groups = "Smoke")
public void Rigester() {
	System.out.println("Enter Details");
}

@Test
public void Search() {
	System.out.println("Product");
}

@Test
public void Select() {
	System.out.println("Denim Shirt");
}

}
