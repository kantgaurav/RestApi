package coreJava_sdetQA;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;

public class createAFile_UseExistMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f1= new File("Ganesh.txt");
		
		String f11= f1.toString();
		
		if(f1.exists()) {
			
			System.out.println("File exist Already");
		
		
			
			
		}
		
		else {
			
			f1.createNewFile();
			System.out.println("Creating New file");
			
			
		}

	}
	
	 public static void writeInFile(Writer f1) {
		 
		 try {
			 BufferedWriter out = new BufferedWriter(f1);
			 
			 out.write("GANeSH:\n");
			 
		 }
		 catch(Exception ex) {
			 
			 ex.printStackTrace();
			 
			 
		 }
	 }
	

}
