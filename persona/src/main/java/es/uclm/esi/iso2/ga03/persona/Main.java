package es.uclm.esi.iso2.ga03.persona;

import java.util.Date;

import es.uclm.esi.iso2.ga03.persona.utility.Utility;

public class Main {

	public static void main(String[] args) {
		try {
            // Sample usage with Utility class for user input
            String name = Utility.readString("Enter name: ");
            String lastName = Utility.readString("Enter last name: ");
            Date dateOfBirth = Utility.readDate("Enter birth date (Format: dd/MM/yyyy): ");
            String nationality = Utility.readString("Enter nationality (Example: Spain. NOTE: ensure it is capitalized): ");
            String education = Utility.readString("Enter education: ");
            String englishCertification = Utility.readString("English certification (Example: A1, B1, B2 or C1): ");
            String phoneNumber = Utility.readString("Enter phone number: ");
            String email = Utility.readString("Enter email: ");

            // Create Persona object
            Persona persona = new Persona(name, lastName, dateOfBirth, nationality,
                    education, englishCertification, phoneNumber, email);

            // Display information
            Utility.writeString("\nDONE! Extra results include:");
            Utility.writeString("Legal Age: " + persona.isLegalAge());
            Utility.writeString("European: " + persona.isEuropean());
        } catch (Exception e) {
            Utility.writeString("Error: " + e.getMessage());
        }

	}

}
