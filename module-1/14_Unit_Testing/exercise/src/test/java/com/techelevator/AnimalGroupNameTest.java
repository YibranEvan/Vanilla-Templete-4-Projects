package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;

public class AnimalGroupNameTest {

    AnimalGroupName exercises = new AnimalGroupName();

    @Test
    public void animalGroupName(){
        assertEquals("Input: animalGroupName(\"Rhino\")", "Crash", exercises.getHerd("Rhino"));
        assertEquals("Input: animalGroupName(\"Giraffe\")", "Tower", exercises.getHerd("Giraffe"));
        assertEquals("Input: animalGroupName(\"Elephant\")", "Herd", exercises.getHerd("Elephant"));
        assertEquals("Input: animalGroupName(\"Lion\")", "Pride", exercises.getHerd("Lion"));
        assertEquals("Input: animalGroupName(\"Crow\")", "Murder", exercises.getHerd("Crow"));
        assertEquals("Input: animalGroupName(\"Pigeon\")", "Kit", exercises.getHerd("Pigeon"));
        assertEquals("Input: animalGroupName(\"Flamingo\")", "Pat", exercises.getHerd("Flamingo"));
        assertEquals("Input: animalGroupName(\"Deer\")", "Herd", exercises.getHerd("Deer"));
        assertEquals("Input: animalGroupName(\"Dog\")", "Pack", exercises.getHerd("Dog"));
        assertEquals("Input: animalGroupName(\"Crocodile\")", "Float", exercises.getHerd("Crocodile"));
        assertEquals("Input: animalGroupName(\"giraffe\")", "Tower", exercises.getHerd("giraffe"));
        assertEquals("Input: animalGroupName(null)", "unknown", exercises.getHerd(null));
        assertEquals("Input: animalGroupName(\"walrus\")", "unknown", exercises.getHerd("walrus"));





    }
}
