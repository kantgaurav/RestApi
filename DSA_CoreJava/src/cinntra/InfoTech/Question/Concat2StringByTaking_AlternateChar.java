package cinntra.InfoTech.Question;

public class Concat2StringByTaking_AlternateChar {

	public static void main(String[] args) {
		        
		        String w1= "RAVISHERVIN";
		        String w2= "TEJA";
		        int i =0; 
		        int j=0;
		        
		        String outPut="";
		        while(i<w1.length() || j<w2.length()){
		        	if(i<w1.length()) {
		        		System.out.println("Value of I is:"+i);
		        		outPut= outPut+ w1.charAt(i);
		        		i++;
		        	}
		        	if(j<w2.length()) {
		        	  	System.out.println(+j);
		        		outPut= outPut+ w2.charAt(j);
		        		j++;
		        	}
		    
		        }
		        System.out.println(outPut);
		    }
		

	}


