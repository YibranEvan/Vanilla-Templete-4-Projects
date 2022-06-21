package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;
public class Lucky13Test {
    Lucky13 exercises = new Lucky13();

    @Test
    public void Lucky13(){
        assertEquals("Input: Lucky13([1, 2, 3])", true, exercises.getLucky(new int[]{0, 2, 4}));

    }
}
