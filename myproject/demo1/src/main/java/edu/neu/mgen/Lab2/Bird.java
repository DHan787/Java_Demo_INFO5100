/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 21:51:21
 * @LastEditTime: 2023-11-20 21:51:27
 * @Description: birds
 * 
 */
package edu.neu.mgen.Lab2;

class Bird extends Animal {
    String speciesName;
    double wingSpan;
    boolean canFly;

    Bird(double size, double weight, boolean predator, String diet, String species, double wingSpan, boolean canFly) {
        super(size, weight, predator, diet);
        this.speciesName = species;
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    void displaySpecificFeatures() {
        System.out.println("Bird - Species: " + speciesName + ", Wing Span: " + wingSpan + " cm, Can Fly: " + canFly);
    }
}
