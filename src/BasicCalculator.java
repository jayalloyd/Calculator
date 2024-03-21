import java.util.Scanner;

public class BasicCalculator {

	public static void main (String a[]) {
		
		boolean Addition=false;
		boolean Substraction=false;
		boolean Division=false;
		boolean Multiplication=false;
	
		Scanner input=new Scanner(System.in);
		System.out.println("Calculator");
    	
		System.out.println("Enter a Valid option 1.Addtion 2.Substraction 3.Multiplication 4.Division 5.to exit");
		int n=input.nextInt();
			switch(n) {
			case (1):
				Addition=true;
			System.out.println("Addition");
			
			
			break;
			case(2):
				Substraction=true;
				System.out.println("Substraction");
		
			
		
			
			break;
			case(3):
				Multiplication=true;
				System.out.println("Multiplication");
			    break;
			
	
			case(4):
				Division=true;
				System.out.println("Division");
			break;
			case(5):
				System.out.println("Exit");
			break;
		}
				

    	
	System.out.println("Enter the first number:");
	int number1=input.nextInt();
	System.out.println("You have entered first number: "+number1);
	System.out.println("Enter the second number:");
	int number2=input.nextInt();
	System.out.println("you have entered  second number : "+number2);
	input.close();
		
			if(Substraction==false&&Multiplication==false&&Division==false) {
				int result_add=number1+number2;
			
	         System.out.println("result of addition is :"+result_add);
			}
			
	
			
			if(Addition==false&&Multiplication==false&&Division==false) {
				int result_sub=number1-number2;
				System.out.println("Result of substraction: "+result_sub);
				
				
				}
		
		
		if(Addition==false&&Multiplication==false&&Substraction==false) {
				int result_div=number1/number2;
				System.out.println("The result of divivsion :"+result_div);
			}
		
		
			if(Addition==false&&Substraction==false&&Division==false) {
				int result_multi=number1*number2;
				System.out.println("The result of multiplication :"+result_multi);
				
			}
		System.out.println("The result  is given");
	input.close();
			
	}

}
	