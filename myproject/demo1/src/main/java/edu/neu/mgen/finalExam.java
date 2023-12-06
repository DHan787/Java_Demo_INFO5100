
package edu.neu.mgen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * @Author: Jinag Han
 * @Date: 2023-12-05 14:53:03
 * @Description: 
 * @LastEditTime: 2023-12-05 16:13:18
 * 
 */
public final class finalExam {

    static String filePathString = "C:\\Users\\ginger\\Desktop\\myFile.txt";

    public static void read() {
        try {
            File file = new File(filePathString);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void write() {
        try {
            FileWriter myWriter = new FileWriter(filePathString,true);
            
            myWriter.write("\nA new String");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        read();
        write();
        read();
    }
}
