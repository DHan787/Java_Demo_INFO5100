/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 21:33:25
 * @LastEditTime: 2023-11-20 21:37:54
 * @Description: Main
 * 
 */
package edu.neu.mgen.HW10_11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of each vehicle type
        Car car = new Car("Tesla", "Model S", 2021, "Red", 4, "Electric");
        Motorbike motorbike = new Motorbike("Ducati", "Panigale", 2020, "Red", false);
        Aircraft aircraft = new Aircraft("Airbus", "A380", 2018, "White", "Commercial", 41000);
        Ship ship = new Ship("Royal Caribbean", "Symphony of the Seas", 2018, "Blue", 228081, 362);

        // List to hold all vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(motorbike);
        vehicles.add(aircraft);
        vehicles.add(ship);

        // Demonstrate polymorphism and class-specific features
        for (Vehicle vehicle : vehicles) {
            System.out.println("Inspecting the vehicle...");
            vehicle.displayInfo();

            System.out.println("How does it start?");
            vehicle.start();

            System.out.println("How does it stop?");
            vehicle.stop();

            // Display unique features
            if (vehicle instanceof Car) {
                System.out.println("It's a car with " + ((Car) vehicle).numOfDoors + " doors and a "
                        + ((Car) vehicle).engineType + " engine.");
            } else if (vehicle instanceof Motorbike) {
                System.out.println("It's a motorbike" + (((Motorbike) vehicle).hasSideCar ? " with a sidecar." : "."));
            } else if (vehicle instanceof Aircraft) {
                System.out.println(
                        "It's an aircraft with a maximum altitude of " + ((Aircraft) vehicle).maxAltitude + " feet.");
            } else if (vehicle instanceof Ship) {
                System.out.println("It's a ship with a tonnage of " + ((Ship) vehicle).tonnage + " and a length of "
                        + ((Ship) vehicle).length + " meters.");
            }

            System.out.println();
        }
    }
}
