package hyl_project;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectMain {
	
	private static String userIn = "";
	
	/**
	 * Lets not forget to document our methods as well :D
	 */
	public void calculateOption() {

		//Lets get this working
		//if (/*requestPossible*/){
		//	produceOutput();
		//} else {
		//	//printSuggestions();
		//}

	}
	
	/**
	 * Lets not forget to document our methods as well :D
	 */
	public void produceOutput() {
		
		//TEST
		FormPrinter printer;
		userInput();
		System.out.println("User request: " + userIn);
		
		printer = new FormPrinter(userIn);
		System.out.println(printer.getType() + ", " + printer.getFurniture() + ", " + printer.getQuantity());
		
		printer.writeReport();	//Writes report
	}
	
	/**
	 * Gets the user input. The message printed is meant to notifty the user about the format
	 * and the meaning of each input.
	 */
	private static void userInput() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter request in the format");
		System.out.println("\n<furniture type> <furniture>, <quantity>\n");
		System.out.println("<Furniture type>:	Type of furniture, such as mesh, Adjustable, or Swing Arm");
		System.out.println("<Furniture>:		Furniture that's being checked, such as Desk, Lamp, Chair");
		System.out.println("<Quantity>:			Amount of specific furniture you are looking for");
		System.out.println("\nEnter:");
		
		userIn = input.nextLine();
		
		input.close();
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TESTING NOW

		search myJDBC = new search("jdbc:mysql://localhost/inventory","code","zhongli9");
		myJDBC.initializeConnection();
<<<<<<< Updated upstream


		
		
		myJDBC.searchFiling("SSJ",1);
		myJDBC.searchFiling("Small",1);
		ArrayList<String> test = myJDBC.searchLamp("Desk",2);
		System.out.println(test.get(0));
		myJDBC.searchChair("Mesh",1);




=======
		
		myJDBC.searchChair("Mesh",1);
		System.out.println(myJDBC.searchChair("Task",1).get(0));
>>>>>>> Stashed changes
		// args = String  furnitureCategory, String furnitureType, and int requestedAmount
	}
}
