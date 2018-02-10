package java_project;

public class Double_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String Destinations[][]=new String[4][4];
	//First row
	Destinations[0][0]="Arizona";
	Destinations[0][1]="California";
	Destinations[0][2]="Honolulu";
	Destinations[0][3]="Miami";
	
	//Second row
	Destinations[1][0]="Newyork";
	Destinations[1][1]="Losangeles";
	Destinations[1][2]="Newjersey";
	Destinations[1][3]="Atlanta";
	
	//Third row
	Destinations[2][0]="Nebraska";
	Destinations[2][1]="Texas";
	Destinations[2][2]="Okhlahoma";
	Destinations[2][3]="NewMexico";
	
	//Fourth row
	Destinations[3][0]="South carolina";
	Destinations[3][1]="North carolina";
	Destinations[3][2]="Virginia";
	Destinations[3][3]="Maryland";
	
	System.out.println(Destinations [2][2]);
	
	//arguments for rows and columns
	int rows=Destinations. length;
	int cols=Destinations[0].length;
	//for loop for the row
	for(int rownum=0;rownum<rows;rownum++) {
	//for loop for the column
	for(int column=0;column<cols;column++)
	
	System.out.println(Destinations[rownum][column]);
	
	
	
	}
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


