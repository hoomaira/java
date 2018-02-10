package java_project;

public class BMI_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Double w= 60.25 ;
     Double h= 1.2 ;
     Double BMI = w/(h*h);
     
     System.out.println("BMI Calculator");
     System.out.println("BMI Calculator is +BMI");
     
     if (BMI < 18.5)
     {
    	 System.out.println("his weight is under weight");
    	 
     }
     if (BMI <18.5-24.9)
     {
    	 System.out.println("his weight is normal" );
     }
	 if (BMI <25-29.9)	
	 {
		 System.out.println("his weight is overweight");
	 }
	 if (BMI >30)
	 {
		 System.out.println("his weight is obese");
	 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
