/*
 * @Author: Jinag Han
 * @Date: 2023-11-20 21:39:13
 * @LastEditTime: 2023-11-20 21:44:45
 * @Description: Exception Handling for Vehicles input
 * 
 */
package edu.neu.mgen.HW10_11;

import java.util.Scanner;
import java.util.InputMismatchException;

public class VehicleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter details for a car:");
            System.out.print("Brand: ");
            String carBrand = scanner.nextLine();
            System.out.print("Model: ");
            String carModel = scanner.nextLine();
            System.out.print("Year: ");
            int carYear = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Color: ");
            String carColor = scanner.nextLine();
            System.out.print("Number of Doors: ");
            int carDoors = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Engine Type: ");
            String carEngine = scanner.nextLine();
            Car car = new Car(carBrand, carModel, carYear, carColor, carDoors, carEngine);

            // Similar input prompts for Motorbike, Aircraft, Ship...

            // After creating all vehicles, display their information
            System.out.println("\nVehicle Information:");
            car.displayInfo();
            car.start();
            car.stop();

            // Similar display for other vehicles...

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct data type.");
        } finally {
            scanner.close();
        }
    }
}
