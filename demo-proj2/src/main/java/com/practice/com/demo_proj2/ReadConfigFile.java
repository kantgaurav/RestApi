package com.practice.com.demo_proj2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfigFile {

    Properties prop ;
	public Properties readConfigFile(){
		// TODO Auto-generated method stub
		
		try {
			FileInputStream  fip = new FileInputStream("./src/main/java/config/config.properties");
	       prop = new Properties();
			prop.load(fip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;

	}

}
