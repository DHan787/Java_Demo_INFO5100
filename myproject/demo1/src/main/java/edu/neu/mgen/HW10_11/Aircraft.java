/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 21:31:22
 * @LastEditTime: 2023-11-20 21:31:31
 * @Description: 
 * 
 */
package edu.neu.mgen.HW10_11;

class Aircraft extends Vehicle {
    String aircraftType;
    int maxAltitude;

    Aircraft(String brand, String model, int year, String color, String aircraftType, int maxAltitude) {
        super(brand, model, year, color);
        this.aircraftType = aircraftType;
        this.maxAltitude = maxAltitude;
    }

    void start() {
        System.out.println("Aircraft is starting");
    }

    void stop() {
        System.out.println("Aircraft is stopping");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Aircraft Type: " + aircraftType + ", Max Altitude: " + maxAltitude);
    }
}
