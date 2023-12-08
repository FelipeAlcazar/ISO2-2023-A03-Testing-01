package es.uclm.esi.iso2.ga03.persona;

import java.util.Date;

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
    
    public boolean isLegalAge() {
        Date currentDate = new Date();
        long millisInYear = 1000L * 60 * 60 * 24 * 365;
        long ageInMillis = currentDate.getTime() - dateOfBirth.getTime();
        int age = (int) (ageInMillis / millisInYear);

        return age >= 18;
    }

    // Method to check if the person is European based on nationality
    public boolean isEuropean() {
    	boolean isEuropean=false;
    	
        String[] europeanCountries = {"Austria", "Belgium", "Bulgaria", "Croatia", "Republic of Cyprus",
                "Czech Republic", "Denmark", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary",
                "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland",
                "Portugal", "Romania", "Slovakia", "Slovenia", "Spain", "Sweden"};

        for (String country : europeanCountries) {
            if (nationality.equalsIgnoreCase(country)) {
            	isEuropean= true;
            }
        }

        return isEuropean;
    }
}
