package io.muic.ooc.fab;

import java.awt.*;


public enum AnimalType {

    RABBIT(0.1, Rabbit.class, Color.BLUE, 8),
    FOX(0.1, Fox.class, Color.green, 20),

    private double breedingProbability;

    private Class animalClass;

    private Color color;

    private int foodValue;

    AnimalType(double breedingProbability, Class animalClass, Color color, int foodValue) {
        this.breedingProbability = breedingProbability;
        this.animalClass = animalClass;
        this.color = color;
        this.foodValue = foodValue;
    }

    public double getBreedingProbability() {
        return breedingProbability;
    }

    public Class getAnimalClass() {
        return animalClass;
    }

    public Color getColor() {
        return color;
    }

    public int getFoodValue() {
        return foodValue;
    }
}
