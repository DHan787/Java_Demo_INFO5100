package edu.neu.mgen;
public class InClassPrac {
    public static void main( String[] args )
    {
        int[][] a = {
            {1,2,3},
            {4,5,6,9},
            {7},
        };
        // In this way, the elements that not allocated do not exsit
       int i = 2;
       int k = 2;
       a[i][k] = 3;
       System.out.println("Element a[" + i + "," + k + "] = " + a[i][k]);

    }
}
