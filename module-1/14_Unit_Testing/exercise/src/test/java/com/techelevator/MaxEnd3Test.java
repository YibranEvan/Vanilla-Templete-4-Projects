package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;
public class MaxEnd3Test {
    MaxEnd3 exercises = new MaxEnd3();

    @Test
    public void MaxEnd3(){
        Assert.assertArrayEquals("Input: MaxEnd3([1, 2, 3])",new int[]{3, 3, 3} , exercises.makeArray(new int[]{1, 2, 3}));
        Assert.assertArrayEquals("Input: MaxEnd3([11, 5, 9])",new int[]{11, 11, 11} , exercises.makeArray(new int[]{11, 5, 9}));
        Assert.assertArrayEquals("Input: MaxEnd3([2, 11, 3])",new int[]{3, 3, 3} , exercises.makeArray(new int[]{2, 11, 3}));

    }

}
