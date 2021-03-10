import java.util.*;


class calculate{
	
	//constructor
	public calculate(int num1, int num2, char sign) {
		this.num1 = num1;
		this.num2 = num2;
		this.sign = sign;
	}
	public static String result;		// not required to make object in main class as "result " is Static variable
	int num1;
	int num2;
	char sign;
	static int a;
	public static void cal(int num1,int num2, char sign) {
	try {		// Using try & catch for Arithmetic Exception occur during operation
		switch(sign){
			case '+':
				a=num1+num2;
				result=Integer.toString(a);		//Converting integer value into string
				break;
			case '-':
				a=num1-num2;
				result=Integer.toString(a);
				break;	
		
			case '*':
				a=num1*num2;
				result=Integer.toString(a);
				break;
		
			case '/':
			    a=num1/num2;
			    result=Integer.toString(a);
				break;	
			}	
		}
	catch(ArithmeticException e ) {
		//Basically for divide by Zero Exception thats value is undefine 
		result ="undefine";
		}
	}
}



public class basicCalci{

	public static void main(String[] args) {
		final String title ="	 ---Arthimetic Calculator---			"; //
		System.out.println(title); 
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		char sign;
		
		System.out.print("Enter first number: ");   	// taking Integer input from user as num1
		num1=scan.nextInt();
		System.out.print("Enter Second number:");   	// taking Integer input from user as num1
		num2 =scan.nextInt();
		System.out.print("Enter operation to be perform (+,-,*,/):");   	// taking Char sign from USER as Arithmetic Operations
		sign=scan.next().charAt(0);
		
		calculate obj=new calculate(num1, num2, sign);		// constructor using for "This" keyword
		
		calculate.cal(obj.num1,obj.num2,obj.sign);		// calling the method of Class Calculate to perform operation and store the output in static variable "result"
 
		
		System.out.println(obj.num1+" "+obj.sign+" "+obj.num2+" = "+(calculate.result));		// print the result of calculation
		scan.close();
		
    }
}
