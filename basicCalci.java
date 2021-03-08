import java.util.*;

public class basicCalci{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");   // taking Integer input from user as num1
		int num1=scan.nextInt();
		System.out.print("Enter Second number:");   // taking Integer input from user as num2
		int num2 =scan.nextInt();
		System.out.print("Enter operation to be perform (+,-,*,/):");   // taking Character 'sign' from USER as Arithmetic Operations
		char sign=scan.next().charAt(0);
		
		
		try {   // Using try & catch for Arithmetic Exception occur during operation
			switch(sign){
				case '+':
					System.out.println(num1+"+"+num2+"="+(num1+num2));
					break;
				case '-':
					System.out.println(num1+"-"+num2+"="+(num1-num2));
					break;	
			
				case '*':
					System.out.println(num1+"*"+num2+"="+(num1*num2));
					break;
			
				case '/':
					System.out.println(num1+"/"+num2+"="+(num1/num2));
					break;	
			}	
		}
		catch(ArithmeticException e ) {
			//Basically for divide by Zero Exception thats value is undefine 
			System.out.println(num1+"/"+num2+"="+" undefine");	
		}
		
    }
}

