package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;

public class Less20Test {
    Less20 exercises = new Less20();

    @Test
    public void Less20(){
        assertEquals("Input: FrontTimes(18)", true, exercises.isLessThanMultipleOf20(18));
        assertEquals("Input: FrontTimes(19)", true, exercises.isLessThanMultipleOf20(19));
        assertEquals("Input: FrontTimes(20)", false, exercises.isLessThanMultipleOf20(20));


    }
}
