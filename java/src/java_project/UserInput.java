package java_project;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	try {
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("your age");
		
		int n=reader.nextInt();
		
	     System.out.println("what is your name");
	     
	     String name=reader.next();
	     
	     System.out.println("my name" + name);
	     System.out.println("i am"+ n +"years");
	}
		
	catch(Exception e) {
	
	System.out.println("do not put string value in age and do not put any any integer value in name");
	}
	finally {
		System.out.println("thanks for your information");
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
