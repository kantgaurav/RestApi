package cinntra.InfoTech.Question;

public class PrintAsciiValOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Python";
		
		for(int i =0; i<word.length();i++) {
			
			
			char c = word.charAt(i);
			
			int x = c;
			
			System.out.println(c+" Ascii value is:"+ x);
		}

	}

}
