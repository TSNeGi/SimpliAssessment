import java.io.IOException;
import java.util.Scanner;

class clr{
	
	public static void main(String ... arg) throws IOException, InterruptedException{
		// This method is used to clear cmd screen
		// May not work with IDE's
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}
		
	
	
	
	  public static void mainback() { // This method is used to return back to main window
	  
	  
	  System.out.println("\nEnter any key to return to main window.");
	  Scanner scan=new Scanner(System.in);
	  String back =scan.nextLine();
	  try { 
		  clr.main();
		  lockerme.main(null);
	  	}
	  catch (InterruptedException | IOException e) {
	  e.printStackTrace(); 
	  }
	  scan.close();
	}
	 
}
