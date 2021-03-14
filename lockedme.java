import java.io.*;
import java.util.*;


class lockedme{
	public static void main( String[] args) {
		int option;
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("\n		Welcome to LockedMe.com \n");
		System.out.println("Developer	  Tarun Negi");
		System.out.println("Company		  LockersApp\n");
		System.out.println("Choose below options :");
		System.out.println("1.  File List");
		System.out.println("2.  Business-Level operations");
		System.out.println("3.  Exit");
		
		
		
		do {

		System.out.print("Enter the option : ");
		option =scan.nextInt();
		
		switch(option) {
		//Case 1 : Call the list method to show the list of files and 
		//         then call mainback method to clear screen and back to main window again.
		
		//Case 2 : Call the businessOp.business() method to perform 2nd option
		//Case 3 : Terminate the code
		//Default: Selected option is not valid then it will print "Invalid option"
		
			case 1:
				fileList.List();
				clr.mainback();
				break;
				
			case 2:
				businessOp.business();
				break;
				
			case 3:
				System.out.println("Thank you for using our services.");
				System.exit(0);
				break;
				
			default:
				System.out.println("\nInvalid option! Please choose the option again!");
				break;
				
		}
	}
		while(option>3);
		
		
		scan.close();
		
		
	}

		}



