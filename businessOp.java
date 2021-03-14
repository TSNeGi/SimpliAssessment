import java.util.*;
import java.io.*;


public class businessOp {
	
	public static void business(){
		int option;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\nBusiness-level operations :");
		System.out.println("Choose below options :");
		System.out.println("1. Add File");
		System.out.println("2. Delete File");
		System.out.println("3. Search");
		System.out.println("4. Quit");
		
		do {

		System.out.print("Enter the option : ");
		option =scan.nextInt();
		
		//Switch will dispatch execution to the option chosen by user. 
		switch(option) {
		
		//Case 1 : Ask for name of File to be Create and  Call Create method to create file
		//Case 2 : Ask for name of File to be Delete and Call delete method to delete file
		//Case 3 : Ask for name of File to be Search and Call Search method to search the file in directory
		//Case 4 : Back to main menu
		//Default: Selected option is not valid then it will print "Invalid option"
		
			case 1:
				System.out.print("\nEnter file name to create:");
				String newFile=scan.next();
				//Call Create method to create file
				create(newFile);
				
				//call mainback method to clear screen and back to main window again.
				clr.mainback();
				break;
				
			case 2:
				System.out.print("Enter file name to delete:");
				String delFile=scan.next();
				//Call delete method to delete file
				delete(delFile);
				
				//call mainback method to clear screen and back to main window again.
				clr.mainback();
				break;
				
			case 3:
				System.out.print("Enter file name search:");
				String searchFile=scan.next();
				//Call Search method to search the file in directory
				search(searchFile);
				
				//call mainback method to clear screen and back to main window again.
				clr.mainback();
				break;
				
			case 4:
				//call mainback method to clear screen and back to main window again.
				clr.mainback();
				
			default:
				//If chosen option is wrong then it will print
				System.out.println("Invalid input please choose again!");
				break;
				
		}
		}
		while(option>3);
		scan.close();
	}
	
	
	
	// This method is used to create a new file in the directory.
	// Create a file with name as per user input and raise a Error if error occurs. 
	public static void create(String newfile) {
		try {			
			File fileObj = new File(newfile);
			//If file  is already present then print "File already exists"
			if (fileObj.createNewFile()) {
		        System.out.println("\nFile created: " + fileObj.getName());
		        
		      } 
			else {
		        System.out.println("\nFile already exists.");
		     
		      }
		 }
		//If an error occurs in try block, it will print the statement.
		catch (IOException e) {
			System.out.println("\nError Occured. Try again!");
		      e.printStackTrace();
		 }
		
	}
		
		
	// This method is used  to delete a file from directory.
	// Delete a file as per user input and raise a Error if error occurs. 
	public static void delete(String delfile) {
		File fileObj = new File(delfile); 
		// Check if file is available to delete 
		if (fileObj.delete()) {
			System.out.println("Deleted the file: " + fileObj.getName());
		    }
		else {
		    System.out.println("File not found!");
		    } 
		}
	
	
	
	// This method is used to search the file from directory.
	public static void search(String searchfile) {
		File fileObj = new File("D:\\LMS"); 
		String[] filesList = fileObj.list(); 
		int  result=binarySearch(filesList, searchfile);
		//Check if file is available or not, if not then print "File not Found" 
		if (result==-1) {
			System.out.println("File not Found!");
		}
		else {
			System.out.println("File is available in Directory");
		}
		
		
		
	}
	
	//This method is used to binary search the files
	static int binarySearch(String[] filesList, String searchFile) 
    { 
        int i = 0, lenList = filesList.length - 1; 
        while (i <= lenList) { 
            int mid = i + (lenList - i) / 2; 
            
            int res = searchFile.compareTo(filesList[mid]); 
            //Check if x is present at mid 
            if (res == 0) 
                return mid; 
            //If x greater, ignore left half 
            if (res > 0) 
                i = mid + 1; 
            //If x is smaller, ignore right half 
            else
                lenList = mid - 1; 
        } 
        return -1;
	
}
}
		
