package es.uclm.esi.iso2.ga03.persona;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.thoughtworks.qdox.parser.ParseException;

import es.uclm.esi.iso2.ga03.persona.utility.Utility;

public class Main {

	public static void main(String[] args) {
		try {
            // Sample usage with Utility class for user input
            String name = Utility.readName("Enter name (no numbers allowed): ");
            String lastName = Utility.readName("Enter last name (no numbers allowed): ");
            Date dateOfBirth = Utility.readDate("Enter birth date (Format: dd/MM/yyyy): ");
            String nationality = Utility.readNationality("Enter nationality (Example: Spain): ");
            String education = Utility.readEducation("Enter education (highSchool, bachelor, degree or master): ");
            String englishCertification = Utility.readEnglishCertification("English certification (A1, A2, B1, B2, C1, C2 or don't type): ");
            String phoneNumber = Utility.readPhoneNumber("Enter phone number (9 numbers only): ");
            String email = Utility.readEmail("Enter email (use @): ");

            // Create Persona object
            Persona persona = new Persona(name, lastName, dateOfBirth, nationality,
                    education, englishCertification, phoneNumber, email);

            // Display information
            Utility.writeString("Legal Age: " + persona.isLegalAge());
            Utility.writeString("European: " + persona.isEuropean());
        } catch (Exception e) {
            Utility.writeString("Error: " + e.getMessage());
        }

	}

}
