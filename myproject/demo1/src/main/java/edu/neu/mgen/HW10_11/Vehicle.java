/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 20:50:56
 * @LastEditTime: 2023-11-20 21:27:51
 * @Description: class vehicle
 * 
 */
package edu.neu.mgen.HW10_11;

abstract class Vehicle {
    String brand;
    String model;
    int year;
    String color;

    public Vehicle(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    abstract void start();

    abstract void stop();

    //
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}
