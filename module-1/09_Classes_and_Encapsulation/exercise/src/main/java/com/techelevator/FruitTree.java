package com.techelevator;

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    // Setters and getters
    public String getTypeOfFruit() {
        return typeOfFruit;
    }
    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    // Constructor
    public FruitTree(String typeOfFruit, int piecesOfFruitLeft) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruitLeft;
    }
}
