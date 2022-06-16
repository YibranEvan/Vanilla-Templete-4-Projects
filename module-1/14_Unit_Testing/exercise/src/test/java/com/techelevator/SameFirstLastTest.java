package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;

public class SameFirstLastTest {

    SameFirstLast exercises = new SameFirstLast();

    @Test
    public void SameFirstLast (){
        assertEquals("Input: SameFirstLast([1, 2, 3])", false, exercises.isItTheSame(new int[]{1, 2, 3}));
        assertEquals("Input: SameFirstLast([1, 2, 3, 1])", true, exercises.isItTheSame(new int[]{1, 2, 3, 1}));
        assertEquals("Input: SameFirstLast([1, 2, 1])", true, exercises.isItTheSame(new int[]{1, 2, 1}));


    }
}
