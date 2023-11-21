/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 21:53:53
 * @LastEditTime: 2023-11-20 21:54:00
 * @Description: fishes
 * 
 */
package edu.neu.mgen.Lab2;

class Fish extends Animal {
    String speciesName;
    int numberOfFins;
    String habitatType;

    Fish(double size, double weight, boolean predator, String diet, String species, int fins, String habitat) {
        super(size, weight, predator, diet);
        this.speciesName = species;
        this.numberOfFins = fins;
        this.habitatType = habitat;
    }

    void displaySpecificFeatures() {
        System.out.println(
                "Fish - Species: " + speciesName + ", Number of Fins: " + numberOfFins + ", Habitat: " + habitatType);
    }
}
