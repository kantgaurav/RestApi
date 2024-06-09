package naveenAutomation_coreJava;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "seleniumJava";
		  String [] strArr= str.split("");
		 for (String s: strArr) {
			 
			 System.out.print(" "+s);
		 }
			 String data= "xXTestingXxXAutomationxxxXEnff;";
			 
			 String d[]= data.split("xX");
			 System.out.println(d[0]);
			 System.out.println(d[0].length());
			 
			 String s= "Testing|Automation|Selenium";
			 String sp[]= s.split("|");
			 System.out.println(sp[0]);
			 String split[]= s.split("\\|");
			 System.out.println(split[0]);
	}


}