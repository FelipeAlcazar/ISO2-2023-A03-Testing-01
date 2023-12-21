package es.uclm.esi.iso2.ga03.persona;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.ParseException;

public class MainTest {

    @Test
    public void testMain() throws ParseException {
        // Prepare user input
        String input = "John\nDoe\n01/01/1990\nSpain\nEducation\nB2\n123456789\njohn.doe@example.com\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        Main.main(new String[]{});

        // Restore System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);

        // Normalize line endings in expected and actual output
        String expectedOutput = "\nDONE! Extra results include:\nLegal Age: true\nEuropean: true\n";
        String actualOutput = outputStream.toString().replaceAll("Enter.*: ", "").replaceAll("\\r\\n", "\n");

        // Verify the output
        assertEquals(expectedOutput, actualOutput);
    }

    // Add more tests for different scenarios as needed
}