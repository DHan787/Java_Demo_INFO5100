/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 21:08:34
 * @LastEditTime: 2023-11-20 21:29:36
 * @Description: Cars
 * 
 */
package edu.neu.mgen.HW10_11;

class Car extends Vehicle {
    int numOfDoors;
    String engineType;

    // Constructor
    Car(String brand, String model, int year, String color, int numOfDoors, String engineType) {
        super(brand, model, year, color);
        this.numOfDoors = numOfDoors;
        this.engineType = engineType;
    }

    void start() {
        System.out.println("Car is starting");
    }

    void stop() {
        System.out.println("Car is stopping");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numOfDoors + ", Engine Type: " + engineType);
    }
}
