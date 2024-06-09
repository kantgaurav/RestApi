package DesignPattern;

public class SingletonDesignPattern {
	
	
	private static SingletonDesignPattern INSTANCE;
	//Lazy Initialization // 
	//private constrcutor . so that we cannot initalised.
	private SingletonDesignPattern() {
	
	}
	
	public static SingletonDesignPattern getInstance() {
		
		if(INSTANCE==null) {
			
			INSTANCE = new SingletonDesignPattern();
		}
		
		
		return INSTANCE;
		
		
	}

}
