package com.practice.com.demo_proj2;

import java.util.Properties;

public class ReadConfigFileInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		ReadConfigFile rcf=  new ReadConfigFile();
		prop=rcf.readConfigFile();
		
		System.out.println(prop.getProperty("browser"));
	
		

	}

}
