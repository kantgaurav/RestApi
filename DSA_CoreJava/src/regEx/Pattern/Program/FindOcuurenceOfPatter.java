package regEx.Pattern.Program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOcuurenceOfPatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abyabbabyab01ba";
		Pattern p = Pattern.compile("ba");
      Matcher  m = p.matcher(str);
      int count = 0;
      while (m.find()) {
    	  
    	  
    	  System.out.println(m.start());
    	  
    	  ++count;
    	  
      }
      
      System.out.println("Total Count "+count);
	}

}
