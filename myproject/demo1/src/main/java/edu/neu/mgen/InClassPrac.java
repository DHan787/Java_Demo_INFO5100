package edu.neu.mgen;
public class InClassPrac {
     enum Level {
            LOW,
            MEDIUM,
            HIGH
            }
    public static void main( String[] args )
    {
            Level myVar = Level.MEDIUM;
            System.out.println(myVar);
            
        int[][] a = {
            {1,2,3},
            {4,5,6,9},
            {7},
        };
        // In this way, the elements that not allocated do not exsit
       int i = 1;
       int k = 1;
       a[i][k] = 3;
       System.out.println("Element a[" + i + "," + k + "] = " + a[i][k]);

    }
}
