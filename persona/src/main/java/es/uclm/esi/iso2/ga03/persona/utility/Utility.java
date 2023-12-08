package es.uclm.esi.iso2.ga03.persona.utility;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Utility {

	    private static final Scanner scanner = new Scanner(System.in);
	    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    
	    // Method to read a string from the keyboard
	    public static String readString(String prompt) {
	        System.out.print(prompt);
	        return scanner.nextLine();
	    }

	    // Method to read an integer from the keyboard
	    public static int readInt(String prompt) {
	        System.out.print(prompt);
	        while (!scanner.hasNextInt()) {
	            System.out.println("Invalid input. Please enter a number.");
	            scanner.next();
	        }
	        int result = scanner.nextInt();
	        scanner.nextLine();
	        return result;
	    }
	    
	 // Method to read a string from the keyboard without numeric characters
	    public static String readName(String prompt) {
	        while (true) {
	            String name = readString(prompt);
	            if (!name.matches(".*\\d.*")) {// Returns true if the name doesn't contain any numeric characters
	                return name;
	            } else {
	                System.out.println("Invalid name. Please enter a name without numeric characters.");
	            }
	        }
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
	    
	 // Method to read a valid nationality from the keyboard
	    public static String readNationality(String prompt) {
	        List<String> validCountryNames = Arrays.asList(
	        		"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina",
	                "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados",
	                "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana",
	                "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon",
	                "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo",
	                "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica",
	                "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea",
	                "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany",
	                "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras",
	                "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Ivory Coast",
	                "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo",
	                "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein",
	                "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands",
	                "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco",
	                "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger",
	                "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay",
	                "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis",
	                "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia",
	                "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands",
	                "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland",
	                "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia",
	                "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom",
	                "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen",
	                "Zambia", "Zimbabwe"
	        );

	        while (true) {
	            String nationality = readString(prompt);
	            if (validCountryNames.contains(nationality)) {
	                return nationality;
	            } else {
	                System.out.println("Invalid nationality. Please enter a valid country name.");
	            }
	        }
	    }
	    
	 // Method to read a phone number from the keyboard
	    public static String readPhoneNumber(String prompt) {
	        while (true) {
	            String phoneNumber = readString(prompt);
	            if (phoneNumber.matches("\\d{9}")) {
	                return phoneNumber;
	            } else {
	                System.out.println("Invalid phone number format. Please enter a valid phone number.");
	            }
	        }
	    }
	    
	 // Method to read a valid email address from the keyboard
	    public static String readEmail(String prompt) {
	        while (true) {
	            String email = readString(prompt);
	            if (email.contains("@")) {
	                return email;
	            } else {
	                System.out.println("Invalid email address. Please enter a valid email.");
	            }
	        }
	    }
	    
	 // Method to read a valid education level from the keyboard
	    public static String readEducation(String prompt) {
	        List<String> validEducationLevels = Arrays.asList("highSchool", "bachelor", "master", "degree");

	        while (true) {
	            String educationLevel = readString(prompt);
	            if (validEducationLevels.contains(educationLevel)) {
	                return educationLevel;
	            } else {
	                System.out.println("Invalid education level. Please enter a valid value.");
	            }
	        }
	    }
	    
	 // Method to read a valid English certification from the keyboard
	    public static String readEnglishCertification(String prompt) {
	        List<String> validCertifications = Arrays.asList("A1", "A2", "B1", "B2", "C1", "C2", "");

	        while (true) {
	            String certification = readString(prompt).toUpperCase(); // Convert to uppercase for case-insensitive comparison
	            if (validCertifications.contains(certification)) {
	                return certification;
	            } else {
	                System.out.println("Invalid English certification. Please enter a valid value.");
	            }
	        }
	    }

	    // Method to write a string to the screen
	    public static void writeString(String output) {
	        System.out.println(output);
	    }

	    // Method to write a number to the screen
	    public static void writeInt(int output) {
	        System.out.println(output);
	    }
}
