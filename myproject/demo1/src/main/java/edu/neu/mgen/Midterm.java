package edu.neu.mgen;

public class Midterm {
    public static int sumOfMatrix(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] midTermMatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };
        // It could be any size of matrix.
        System.out.println("The sum of the matrix is " +
                sumOfMatrix(midTermMatrix));
    }
}
