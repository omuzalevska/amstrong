package dev.omuzalevska.amstrong;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class AppTest {

    @Test
    void testAppWithArmstrongNumber() {

        String input = "153\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
   
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        App.main(new String[]{});

        assertThat(outputStream.toString(), containsString("153 yes"));
    }

    @Test
    void testAppWithNonArmstrongNumber() {

        String input = "123\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        App.main(new String[] {});

        assertThat(outputStream.toString(), containsString("123 not"));
    }

    @Test
    void testAppWithZero() {
        String input = "0\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        App.main(new String[] {});

        assertThat(outputStream.toString(), containsString("0 yes"));
    }
}