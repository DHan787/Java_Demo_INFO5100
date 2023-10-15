package edu.neu.mgen;

import java.util.Scanner;

// by Jiang Han
/*
*declare and initialize variables of types "int", "long", "double", "boolean", and "char" - two variables for each type.
*convert initialized variables of type "int" to "long"
*convert initialized variables of type "long" to "int"
*enter values for variables from the terminal.
*write the code and run the program for various arithmetic and logical operation with the variables.
*print the results in the terminal.
*/
public class HW4 {
    public static void main( String[] args )
    {
        int num1 = 1,num2 = 2;
        long long1 = 1, long2 = 2;
        double double1 = 1.0, double2 = 2.0;
        boolean isTrue = true, isFalse = false;
        char char1 = 1,char2 = 2;
        // should be char char1 = '1';
        long int2long = num1;
        System.out.println("int to long:" + int2long);
        int long2int = (int)long1;
        System.out.println("long to int:" + long2int);
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Input the first number");
        num1 = myScanner.nextInt();
        System.out.println("Input the second number");
        num2 = myScanner.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        myScanner.close();
        
        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
        boolean andResult = isTrue && isFalse;
        boolean orResult = isTrue || isFalse;
        boolean notResult = !isTrue;

        System.out.println("\nLogical Operations:");
        System.out.println("AND: " + andResult);
        System.out.println("OR: " + orResult);
        System.out.println("NOT: " + notResult);
    }
}
