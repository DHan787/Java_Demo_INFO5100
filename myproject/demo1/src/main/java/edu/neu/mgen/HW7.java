package edu.neu.mgen;

// by jiang
public class HW7 {
    public static void main(String[] args) {
        int[][] A = { { 2, 3, 4 },
                { 3, 4, 5 } };
        int[][] B = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        // Check if the matrices can be multiplied A*B.
        if (A[0].length == B.length) {
            matrixToString(multiply(A, B));
        } else {
            System.out.println("Matrix A and Matrix B cannot be muliplied");
        }

    }

    /*
     * print the result in matrix format
     */
    public static void matrixToString(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
     * return the result of multiplication
     */
    public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        // get the length of the matrix
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
}
