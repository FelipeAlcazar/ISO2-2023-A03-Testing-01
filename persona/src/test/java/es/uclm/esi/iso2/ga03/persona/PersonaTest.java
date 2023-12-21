/**
 * 
 */
package es.uclm.esi.iso2.ga03.persona;
import static org.junit.Assert.*;
import org.junit.Test;

import es.uclm.esi.iso2.ga03.persona.utility.Utility;

import java.text.ParseException;
import java.util.Date;

public class PersonaTest {

    @Test
    public void testIsLegalAge() throws ParseException {
        Date dateOfBirthLegal = Utility.dateFormat.parse("01/01/2000");
        Date dateOfBirthIllegal = Utility.dateFormat.parse("01/01/2010");

        Persona legalPerson = new Persona("Legal", "Person", dateOfBirthLegal, "USA", "Education", "Cert", "123456789", "legal@example.com");
        Persona illegalPerson = new Persona("Illegal", "Person", dateOfBirthIllegal, "USA", "Education", "Cert", "123456789", "illegal@example.com");

        assertTrue(legalPerson.isLegalAge());
        assertFalse(illegalPerson.isLegalAge());
    }

    @Test
    public void testIsEuropean() throws ParseException {
        Date dateOfBirth = Utility.dateFormat.parse("01/01/1990");

        Persona europeanPerson = new Persona("European", "Person", dateOfBirth, "Spain", "Education", "Cert", "123456789", "european@example.com");
        Persona nonEuropeanPerson = new Persona("Non-European", "Person", dateOfBirth, "Canada", "Education", "Cert", "123456789", "non.european@example.com");

        assertTrue(europeanPerson.isEuropean());
        assertFalse(nonEuropeanPerson.isEuropean());
    }
}
