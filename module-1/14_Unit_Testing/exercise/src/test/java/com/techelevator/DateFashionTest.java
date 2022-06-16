package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;

public class DateFashionTest {
    DateFashion exercises = new DateFashion();

    @Test
    public void DateFashion(){
        assertEquals("Input: CigarParty(5, 10)", 2, exercises.getATable(5,10));
        assertEquals("Input: CigarParty(5, 2)", 0, exercises.getATable(5,2));
        assertEquals("Input: CigarParty(5, 5)", 1, exercises.getATable(5,5));



    }
}
