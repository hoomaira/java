package java_project;

import java.util.Scanner;
public class AssignmentScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Scanner reader=new Scanner(System.in);
  
  System.out.println("what is your name");
  String name=reader.next();
  System.out.println("my name"+name);
  
  System.out.println("what is your age");
  int n=reader.nextInt();
  System.out.println("i am"+n+"years");
  
  System.out.println("what is your salary");
  int s=reader.nextInt();
  System.out.println("my salary is"+s);
  
  System.out.println("which sate are you from");
  String state=reader.next();
  System.out.println("i am from"+state);
  
  System.out.println("which city are you from");
  String city=reader.next();
  System.out.println("i am from"+city);
  
  System.out.println("what is your address");
  int m=reader.nextInt();
  System.out.println("my address is"+m);
  
  System.out.println("what is your zipcode");
  int d=reader.nextInt();
  System.out.println("my zipcode is"+d);
  
  
  
  
  
  
  
  
  
	}

}
