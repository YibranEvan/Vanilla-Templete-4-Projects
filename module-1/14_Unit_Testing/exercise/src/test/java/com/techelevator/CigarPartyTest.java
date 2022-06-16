package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;

public class CigarPartyTest {
    CigarParty exercises = new CigarParty();

        @Test
        public void CigarParty() {

            assertEquals("Input: CigarParty(30, false)", false, exercises.haveParty(30,false));
            assertEquals("Input: CigarParty(50, false)", true, exercises.haveParty(50,false));
            assertEquals("Input: CigarParty(70, true)", true, exercises.haveParty(70,true));

        }
}
