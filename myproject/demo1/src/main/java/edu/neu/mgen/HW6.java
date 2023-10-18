package edu.neu.mgen;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args){
        enum Length{
            SHORT,
            MEDIUM,
            LONG,
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any word: ");
        //Get the start time
        long startTime = System.currentTimeMillis();
        //trim() here is to remove space and others
        String inputWord = input.nextLine().trim();
        //Get input time
        long endTime = System.currentTimeMillis();
        
        //Calculate the duration
        long durationTime = endTime - startTime;

        input.close();
        Length wordLengthClassification ;
        if (inputWord.isEmpty()) {
            System.out.println("You did not enter any word");
        } else {
            int wordLength = inputWord.length();
            if (wordLength <= 5) {
                wordLengthClassification = Length.SHORT;
            } else if (wordLength <= 10) {
               wordLengthClassification = Length.MEDIUM;
            } else {
                wordLengthClassification = Length.LONG;
            }

            System.out.println("Your word is " + inputWord);
            System.out.println("It is a " + wordLengthClassification.toString().toLowerCase() + " word");
            System.out.println("The length of the word is " + wordLength);
            System.out.println("Your reaction time is " + durationTime + " milliseconds");
        }
    
    }
}
