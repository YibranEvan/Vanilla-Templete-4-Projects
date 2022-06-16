package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;


public class StringBitsTest {

   StringBits exercises = new StringBits();

    @Test
    public void getBits() {
        assertEquals("Input: getBits(\"Heeololeo\")", "Hello", exercises.getBits("Heeololeo"));
        assertEquals("Input: getBits(\"Hello\")", "Hlo", exercises.getBits("Hello"));
        assertEquals("Input: getBits(\"Hi\")", "H", exercises.getBits("Hi"));



    }

}
