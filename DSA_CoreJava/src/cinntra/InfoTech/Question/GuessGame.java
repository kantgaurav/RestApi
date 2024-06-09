package cinntra.InfoTech.Question;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("let US play Guess Game");
		
		int secretNum= 9;
		Scanner sc = new Scanner(System.in);
		int count =0; 
		int totalChance= 3;
		
		while(count< totalChance) {
			System.out.println("Pls enter ur Magic Number");
			 int input =  sc.nextInt();
			 System.out.println("You entered the Magic Number:"+input);
			 count+=1;
			 if(input==secretNum) {
				 System.out.println("U won the Game"+"Congrats");
				 break;
			 }
			
			
		}
		
		System.out.println("U are Out Now");

	}

}
