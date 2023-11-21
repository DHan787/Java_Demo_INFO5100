/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 21:52:13
 * @LastEditTime: 2023-11-20 21:52:21
 * @Description: land animals
 * 
 */
package edu.neu.mgen.Lab2;

class LandAnimal extends Animal {
    String speciesName;
    int numberOfLegs;
    String habitatType;

    LandAnimal(double size, double weight, boolean predator, String diet, String species, int legs, String habitat) {
        super(size, weight, predator, diet);
        this.speciesName = species;
        this.numberOfLegs = legs;
        this.habitatType = habitat;
    }

    void displaySpecificFeatures() {
        System.out.println("Land Animal - Species: " + speciesName + ", Number of Legs: " + numberOfLegs + ", Habitat: "
                + habitatType);
    }
}
