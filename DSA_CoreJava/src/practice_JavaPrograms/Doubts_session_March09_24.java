package practice_JavaPrograms;

public class Doubts_session_March09_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st= "Pooja0484@jhkk06676+44";
		String num = "";
		
		for(int i =0; i<st.length(); i++) {
			
			
			if(st.charAt(i)>='0' && st.charAt(i)<='9') {
				
				
				System.out.println(st.charAt(i));
				
				num= num+st.charAt(i);
				
				
			}
			
		}
		
		System.out.println(Long.parseLong(num));

	}

}
