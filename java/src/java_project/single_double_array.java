package java_project;

public class single_double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String Day[]=new String[7];
	
	Day[0]="sunday";
	Day[1]="monday";
	Day[2]="tuesday";
	Day[3]="wednesday";
	Day[4]="thursday";
	Day[5]="friday";
	Day[6]="saturday";
	
	System.out.println(Day[4]);
	
	for(int x=0;x<Day.length;x++)
	{
	System.out.println(Day[x]);
	}
		
	String Month[][]=new String[3][3];
	
	//first row
	Month[0][0]="January";
	Month[0][1]="February";
	Month[0][2]="March";
	
	//second row
	Month[1][0]="April";
	Month[1][1]="May";
	Month[1][2]="June";
	
	//third row
	Month[2][0]="July";
	Month[2][1]="August";
	Month[2][2]="September";
	
	System.out.println(Month[2][0]);
	int rows=Month.length;
	int cols=Month[0].length;
	for( int rownum=0;rownum<rows;rownum++);{
	for(int column=0;column<cols;column++);{
		
	System.out.println(Month);
	
	}
	
	
	}
	
	
		
	}

}
