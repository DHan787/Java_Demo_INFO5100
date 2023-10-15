package edu.neu.mgen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// by Jiang Han 
public class HW5 {
    public static void main(String[] args) {
        // Task 3
        int x = 10;
        int y = 25;

        // Using the max() method to find the maximum of two values
        int maxResult = Math.max(x, y);
        System.out.println("The maximum value between x and y is: " + maxResult);

        // Using the min() method to find the minimum of two values
        int minResult = Math.min(x, y);
        System.out.println("The minimum value between x and y is: " + minResult);

        // Using the sqrt() method to calculate the square root of a value
        double sqrtX = Math.sqrt(x);
        double sqrtY = Math.sqrt(y);
        System.out.println("Square root of x: " + sqrtX);
        System.out.println("Square root of y: " + sqrtY);
        /*
         * Math.max(x, y) method is to find the maximum value between x and y. 
         * Math.min(x, y) method is to find the minimum value between x and y. 
         * Math.sqrt(x) and Math.sqrt(y) methods is to calculate the square root of x and y, respectively. 
         */
        // Task 4
        String str = "Oakland";

        // Find the length of the string
        int strLength = str.length();
        System.out.println("Length of the string: " + strLength);

        // Find a character with index 2 in the string
        char charAtIndex2 = str.charAt(2);
        System.out.println("Character at index 2: " + charAtIndex2);

        // Extract a substring "land" from str
        String subString = str.substring(3, 7);
        System.out.println("Substring: " + subString);
        
        // Or I can do it in another way
        String wordToFind = "land";
        int index = str.indexOf(wordToFind);
        if(index != -1){
            System.out.println("Word found: " 
                                + str.substring(index,(index + wordToFind.length()))
                                +". Index from " + index
                                +" to " + (index + wordToFind.length()));
        } else {
            System.out.println("Word not found from the text: " + str);
        }

        // Convert all letters in str to capital letters "OAKLAND"
        String strInUpperCase = str.toUpperCase();
        System.out.println("String in uppercase: " + strInUpperCase);

        // Task 5
        int[] abc = {1, 3, 5, 2, 5};

        // Find the length of the array
        int arrayLength = abc.length;
        System.out.println("Length of the array: " + arrayLength);

        // Find the last member of the array
        int lastElement = abc[arrayLength - 1];
        System.out.println("Last element of the array: " + lastElement);

        // Task 6
        List<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Austin", "Houston", "Oakland", "Paris", "San Francisco", "Seattle");

        // Remove "Paris" from the ArrayList
        cities.remove("Paris");
        System.out.println("Cities after removing 'Paris': " + cities);
    }
    
}

