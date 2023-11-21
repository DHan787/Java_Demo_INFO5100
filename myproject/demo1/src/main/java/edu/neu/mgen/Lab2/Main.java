/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 21:55:30
 * @LastEditTime: 2023-11-20 21:56:04
 * @Description: main
 * 
 */
package edu.neu.mgen.Lab2;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird(100, 6.5, true, "Carnivore", "Eagle", 220, true);
        LandAnimal lion = new LandAnimal(250, 190, true, "Carnivore", "Lion", 4, "Savannah");
        Fish salmon = new Fish(70, 5, false, "Omnivore", "Salmon", 2, "Freshwater");

        Animal[] animals = { eagle, lion, salmon };

        for (Animal animal : animals) {
            animal.displayCommonFeatures();
            animal.displaySpecificFeatures();
            System.out.println();
        }
    }
}
