package cinntra.InfoTech.Question;

public class RemoveAllVolwelsFromString {

	public static void main(String[] args) {
		
	String str = "Terna Orchids the International school";
	String outPut=" ";
	
	String vowels = "aeiouAEIOU";
	
	for(int i =0; i< str.length(); i++) {
		
		       int x =vowels.indexOf(str.charAt(i));
		       
		       System.out.println(x);
		       
		       if(x<0) {
		    	   
		    	   outPut= outPut+str.charAt(i);
		       }
		
	}
	
  System.out.println(outPut);
}
}