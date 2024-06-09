package naveenAutomationLab;

public class shortDataByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//short will take : -32768 to 32767 
		//it will store be  in 2 bits 
		
		//short s = 32768;
		
		short a =3200;
		short b= 32000;
		short ss= (short) (a+b);
		//System.out.println(a+b);
		
		System.out.println(ss);
		
		char c = 'B';
		
		int aa = 1;
		System.out.println('a'+aa);
		
		
		for (int i ='b'-'a'; i<'d'; i++) {
			
			System.out.println(i);
		}
		
		
		char  k ='A';
		
		int val = 'A';
		
		//VAL =65
		
		System.out.println(k++);  //A
		System.out.println(++k);// C
		
		
		System.out.println(val++); // 65
		System.out.println(++val);//67
		

	}

}
