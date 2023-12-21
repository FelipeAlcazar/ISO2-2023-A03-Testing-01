package es.uclm.esi.iso2.ga03.persona.utility;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Utility {

	    private static final Scanner scanner = new Scanner(System.in);
	    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    
	    // Method to read a string from the keyboard
	    public static String readString(String prompt) {
	        System.out.print(prompt);
	        return scanner.nextLine();
	    }
	    
	    // Method to read a valid date from the keyboard with the format "dd/MM/yyyy"
	    public static Date readDate(String prompt) {
	        while (true) {
	            String dateStr = readString(prompt);

	            try {
	                return dateFormat.parse(dateStr);
	            } catch (ParseException e) {
	                System.out.println("Invalid date. Please enter a valid date.");
	            }
	        }
	    }

	    // Method to write a string to the screen
	    public static void writeString(String output) {
	        System.out.println(output);
	    }
}
