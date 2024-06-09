package java_String_Example;

public class ConversionFromStringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 65;
		
		String s = Integer.toString(x);
		System.out.println(s);
		System.out.println(s.getClass());
		
		String i= "786";
		int y= Integer.parseInt(i);
		
		System.out.println(y);
		//System.out.println(y.getClass());
		
		String str= String.valueOf(x);
		
		System.out.println(str);
		

	}

}
