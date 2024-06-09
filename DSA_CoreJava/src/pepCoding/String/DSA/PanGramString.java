package pepCoding.String.DSA;

import java.util.Arrays;

public class PanGramString {

	public static void main(String[] args) {
		// Sentences contains All the 26 ALPHABETS
		String sen = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		char[] y = sen.replace(" ", "").toCharArray();
		int len = y.length;
		int[] arr = new int[26];
		int i = 0;
		while (i !=len) {
			System.out.println(" For "+i + " "+y[i]);
			int index = y[i] - 65;
			arr[index] = 1;
			++i;
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		//Now Traverse the Arraay 
		  int k=0;
		  
		  while(k<=25) {
			  System.out.println("Iterate Array one by One");
			  if(arr[k]==1) {
				  k++;
			  }
			  else {
				  
				  System.out.println("NOT PANGRAMS ");
				  System.exit(0);
			  }
			  
		  }
		  System.out.println("PANGRAM");
		

	}

}
