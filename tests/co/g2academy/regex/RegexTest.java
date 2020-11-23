package co.g2academy.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class RegexTest {

    @Test
    public void testSingleCharacterUsingIterativeCode() {
        Pattern pattern = Pattern.compile(".s"); // single character test
        // ".s" maksudnya adalah hanya bisa 2 karakter, dan formatnya adalah . boleh apa aja, abis . adalah char s
        Matcher matcher = pattern.matcher("as");
        boolean actual = matcher.matches();
        assertTrue(actual);
    }

    @Test
    public void testSingleCharacterRegexUsingChainingCode() {
        assertTrue(Pattern.compile(".s").matcher("as").matches());
    }

    @Test
    public void testSingleCharacterRegexUsingPatternMatchesMethod() {
        assertTrue(Pattern.matches(".s", "as"));
    }

    @Test
    public void testEmailInputRegex() {
        assertTrue(Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",
                "fadlilmuhammad96@gmail.com"));
    }
}