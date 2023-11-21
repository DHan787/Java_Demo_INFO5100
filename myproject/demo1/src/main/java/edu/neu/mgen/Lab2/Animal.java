/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 21:50:41
 * @LastEditTime: 2023-11-20 21:50:47
 * @Description: animals
 * 
 */
package edu.neu.mgen.Lab2;

abstract class Animal {
    double typicalSize; // in centimeters
    double typicalWeight; // in kilograms
    boolean isPredator;
    String dietType;

    Animal(double size, double weight, boolean predator, String diet) {
        this.typicalSize = size;
        this.typicalWeight = weight;
        this.isPredator = predator;
        this.dietType = diet;
    }

    void displayCommonFeatures() {
        System.out.println("Size: " + typicalSize + " cm, Weight: " + typicalWeight + " kg, Predator: " + isPredator
                + ", Diet: " + dietType);
    }

    abstract void displaySpecificFeatures();
}
