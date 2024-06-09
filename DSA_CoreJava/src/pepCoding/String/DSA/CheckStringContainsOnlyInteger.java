package pepCoding.String.DSA;

public class CheckStringContainsOnlyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String inp= "893%238748";
		
		boolean res= checkStringIsIntegerOnly(inp);
		System.out.println(res);

	}
	
	public static boolean checkStringIsIntegerOnly(String s) {
		
		boolean res= false; 
		
			  
			  //Find the size :  
			  
			  int len = s.length();
			  
			  int i=0; 
			  
			  while (i !=len) {
				  
				  char c= s.charAt(i) ;
				  if(c>='0'  && c<='9') {
					  
					  System.out.println("Char is INTEGER");
					  res= true;
					  i++;
				  }
				  else {
					   System.out.println("Not Integer break the Loopp");
					   res= false;
					  break;
				  }
				  

	}
			return res;

}
	
}
