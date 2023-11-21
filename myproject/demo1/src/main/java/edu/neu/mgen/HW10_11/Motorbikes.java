/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 21:10:05
 * @LastEditTime: 2023-11-20 21:28:56
 * @Description: motobikes
 * 
 */
package edu.neu.mgen.HW10_11;

class Motorbike extends Vehicle {
    boolean hasSideCar;

    Motorbike(String brand, String model, int year, String color, boolean hasSideCar) {
        super(brand, model, year, color);
        this.hasSideCar = hasSideCar;
    }

    void start() {
        System.out.println("Motorbike is starting");
    }

    void stop() {
        System.out.println("Motorbike is stopping");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Side Car: " + hasSideCar);
    }
}
