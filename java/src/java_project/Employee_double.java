package java_project;

public class Employee_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String Employee[][]=new String[3][3];
	//first row
	Employee[0][0]="Hoomaira";
	Employee[0][1]="Mania";
	Employee[0][2]="Fatiha";
	
	//second row
	Employee[1][0]="Faiyaz";
	Employee[1][1]="Haider";
	Employee[1][2]="Fakhrul";
	
	//third row
	Employee[2][0]="Anusha";
	Employee[2][1]="Ramaya";
	Employee[2][2]="Rutu";
	
	//System.out.println(Employee[1][2]);
	
	//arguments for rows and columns
	
	int rows=Employee.length;
	int cols=Employee[0].length;
	//for loop for the row
	for(int rownum=0;rownum<rows;rownum++) {
	//for loop for the column
	for(int column=0;column<cols;column++){
		
    System.out.println(Employee[rownum][column]);
	
    
	}
	}
	
	
	
	}
	
	
	
	
	
	
}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


