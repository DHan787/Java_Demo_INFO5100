/*
 * @Author: Jinag Han
 * @Date: 2023-11-27 21:31:03
 * @Description: 
 * @LastEditTime: 2023-11-27 21:34:32
 * 
 */
package edu.neu.mgen.HW12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadandWrite {
    public void read() {
        try {
            File file = new File("my_test_file.txt");
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

    public void write() {
        try {
            FileWriter myWriter = new FileWriter("my_test_file.txt");
            myWriter.write("Java write test");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
