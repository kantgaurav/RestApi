package java_String_Example;



///https://www.digitalocean.com/community/tutorials/what-is-java-string-pool
public class StringPool_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "Cat";
	        String s2 = "Cat";
	        
	        String s3= new String("Cat");
		
	        
	        System.out.println(s1==s2);
	        
	        System.out.println(s1==s3);
		
		//Find the Object HashCode 
	        
	        System.out.println(System.identityHashCode(s2));
	        
	        System.out.println(System.identityHashCode(s1));
	        
	        System.out.println(s3.hashCode());

	}

}
