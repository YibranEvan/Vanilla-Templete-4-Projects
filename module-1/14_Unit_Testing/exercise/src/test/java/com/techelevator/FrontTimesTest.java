package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;

public class FrontTimesTest {
    FrontTimes exercises = new FrontTimes();

    @Test
    public void FrontTimes(){
        assertEquals("Input: FrontTimes(\"Chocolate\", 2)", "ChoCho", exercises.generateString("Chocolate", 2));
        assertEquals("Input: FrontTimes(\"Chocolate\", 3)", "ChoChoCho", exercises.generateString("Chocolate", 3));
        assertEquals("Input: FrontTimes(\"Abc\", 3)", "AbcAbcAbc", exercises.generateString("Abc", 3));


    }

}
