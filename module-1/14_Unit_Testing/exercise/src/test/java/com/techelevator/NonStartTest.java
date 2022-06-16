package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;

public class NonStartTest {

    NonStart exercises = new NonStart();

    @Test
    public void nonStart(){
        assertEquals("Input: nonStart(\"Hello\", \"There\")", "ellohere", exercises.getPartialString("Hello", "There"));
        assertEquals("Input: nonStart(\"java\", \"code\")", "avaode", exercises.getPartialString("java", "code"));
        assertEquals("Input: nonStart(\"shotl\", \"java\")", "hotlava", exercises.getPartialString("shotl", "java"));

    }


}
