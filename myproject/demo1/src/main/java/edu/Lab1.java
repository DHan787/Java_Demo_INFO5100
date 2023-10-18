package edu;

import java.util.ArrayList;

public class Lab1 {
    //Output the array in required format
    public static String arrayToString(int[] arr) {
        StringBuilder builder = new StringBuilder();
        //Append coma after each number
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if (i < arr.length - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }
    public static void part1(){
        //Initialize x,y and z
        int[] x = {4,10,23,8,16};
        int[] y = {3,49,11,12,7};
        int[] z = new int[5];
        for(int i = 0; i < 5; i++){
            z[i] = x[i] > y[i] ? x[i] : y[i]; 
        }
         System.out.println("Array x = { "+ arrayToString(x) + "}");
         System.out.println("Array x = { "+ arrayToString(y) + "}");
         System.out.println("Array x + y = { "+ arrayToString(z) + "}");
    }

    //Here is the method for part 2
    //Switch the first and last letters of the name
    private static String switchFirstAndLastLetter(String name) {
        if (name.length() < 2) {
            // Handle names with less than 2 characters
            return name;
        }
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);
        String middle = name.substring(1, name.length() - 1);
        return Character.toUpperCase(lastLetter) + middle + Character.toLowerCase(firstLetter);
    }
    public static void part2(){
         ArrayList<String> names = new ArrayList<>();
        names.add("J");
        names.add("Li");
        names.add("Deckard");
        names.add("Jiang");
        names.add("Henrietta");

        // Switch the first and last letters of each name
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            switchedNames.add(switchFirstAndLastLetter(name));
        }

        // Display the original and switched names
        System.out.print("Names = { ");
         int i = 0;
        for (String name : names) {
            if ( i < 4 ){
                System.out.print(name + ", ");
            }else{
                System.out.println(name + " }");
            }
            i++;
        }

        System.out.print("Names (switched) = { ");
        int j = 0;
        for (String switchedName : switchedNames) {
            if( j < 4 ){
                System.out.print(switchedName + ", ");
            }else{
                System.out.println(switchedName + " }");
            }
            j++;
        }

    }
    public static void main(String[] args){
        part1();
        part2();
    }
}
