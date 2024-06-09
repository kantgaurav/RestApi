package DesignPattern;

public class TestSingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SingletonDesignPattern  sdp= new SingletonDesignPattern();
		SingletonDesignPattern  obj1=SingletonDesignPattern.getInstance();
		SingletonDesignPattern  obj2=SingletonDesignPattern.getInstance();
		System.out.println(obj1==obj2);
	}

}
