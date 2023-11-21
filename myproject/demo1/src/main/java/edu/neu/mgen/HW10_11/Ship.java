/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 21:32:38
 * @LastEditTime: 2023-11-20 21:32:44
 * @Description: ships
 * 
 */
package edu.neu.mgen.HW10_11;

class Ship extends Vehicle {
    int tonnage;
    float length;

    Ship(String brand, String model, int year, String color, int tonnage, float length) {
        super(brand, model, year, color);
        this.tonnage = tonnage;
        this.length = length;
    }

    void start() {
        System.out.println("Ship is starting");
    }

    void stop() {
        System.out.println("Ship is stopping");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Tonnage: " + tonnage + ", Length: " + length + " meters");
    }
}
