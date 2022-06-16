package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;
public class Lucky13Test {
    Lucky13 exercises = new Lucky13();

    @Test
    public void Lucky13(){
        assertEquals("Input: FrontTimes([0, 2, 4])", true, exercises.getLucky(new int[]{0, 2, 4}));
        assertEquals("Input: FrontTimes([1, 2, 3])", false, exercises.getLucky(new int[]{1, 2, 3}));
        assertEquals("Input: FrontTimes([1, 2, 4])", false, exercises.getLucky(new int[]{1, 2, 4}));
        
    }
}
