package pepCoding.String.DSA;

public class CharisAlpabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java8.0";
		
		String alphbets ="  ";
		
		String val = "";
		
		System.out.println(val.isEmpty());
		System.out.println(alphbets.isBlank());
		
		char ch []= str.toCharArray();
		
		for (int i =0 ; i<str.length();i++) {
			
			if(Character.isAlphabetic(ch[i])) {
			   //alphbets= alphbets+str.charAt(i);
				alphbets= alphbets+ch[i];
				
			}
			else {
				   if(Character.isDigit(ch[i])) {
					  System.out.println("Digit is:"+ ch[i]);					   
					  val = val+ch[i];
				   }
				
			}
	   
		}
		System.out.println("Alphbet String is :"+alphbets);
		
		System.out.println("Numeric String is:"+val);
	}

}
