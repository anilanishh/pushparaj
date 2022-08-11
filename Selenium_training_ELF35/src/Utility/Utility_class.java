package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Utility_class {

	
 public static String get_url() throws Exception {
	 
	 		
		{
			String filepath="./File_Configaration/Test_configuration_properties";
			FileInputStream fis=new FileInputStream(filepath);
			
			Properties pro=new Properties();
			pro.load(fis);
			String url=pro.getProperty("Url");
			System.out.println(url);
			return url;
		}
		
 }
	}


