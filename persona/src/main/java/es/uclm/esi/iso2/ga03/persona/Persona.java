package es.uclm.esi.iso2.ga03.persona;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Persona {
    private String name;
    private String lastName;
    private Date dateOfBirth;
    private String nationality;
    private String education;
    private String englishCertification;
    private String phoneNumber;
    private String email;

    // Constructor
    public Persona(String name, String lastName, Date dateOfBirth, String nationality,
                   String education, String englishCertification, String phoneNumber, String email) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.education = education;
        this.englishCertification = englishCertification;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    // Method to calculate age in years
    public int getAge() {
        Date currentDate = new Date();
        long ageInMillis = currentDate.getTime() - dateOfBirth.getTime();
        long millisInYear = 1000L * 60 * 60 * 24 * 365;
        return (int) (ageInMillis / millisInYear);
    }

    // Method to check if the person is of legal age (18 years or older)
    public boolean isLegalAge() {
        return getAge() >= 18;
    }
    
    // Method to check if the person is European based on nationality
    public boolean isEuropean() {
    	
    	List<String> europeanCountries = Arrays.asList(
                "Austria", "Belgium", "Bulgaria", "Croatia", "Republic of Cyprus",
                "Czech Republic", "Denmark", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary",
                "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland",
                "Portugal", "Romania", "Slovakia", "Slovenia", "Spain", "Sweden"
        );

        return europeanCountries.contains(nationality);
    }
}
