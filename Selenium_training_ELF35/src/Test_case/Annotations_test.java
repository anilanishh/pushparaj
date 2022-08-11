package Test_case;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Annotations_test {
@Test
public void ReadData() throws IOException {
	
		String filepath="./Test_Configaration/Test_configuration_property";
	FileInputStream fis=new FileInputStream(filepath);
	
	
	Properties prop=new Properties();
	prop.load(fis);
	
	
	
	String name=prop.getProperty("Name");
	System.out.println(name);
	
	String company=prop.getProperty("company");
	System.out.println(company);
	
	
	String Loc=prop.getProperty("Location");
	System.out.println(Loc);
}
}
