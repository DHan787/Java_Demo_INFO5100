package edu.neu.mgen;

// by jiang han
public class HW8 {
    public static void main(String[] args) {
        // First array
        String[] array1 = { "Anne", "John", "Alex", "Jessica" };
        printArray("Original array:", array1);
        String[] reversedArray1 = reverseAndCapitalize(array1);
        printArray("Resultant array:", reversedArray1);

        // Second array
        String[] array2 = { "Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter" };
        printArray("Original array:", array2);
        String[] reversedArray2 = reverseAndCapitalize(array2);
        printArray("Resultant array:", reversedArray2);
    }

    // reverse and capitalize the elements of an array
    public static String[] reverseAndCapitalize(String[] inputArray) {
        String[] resultArray = new String[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            String originalString = inputArray[i];
            StringBuilder reversedString = new StringBuilder();

            // Reverse the string and capitalize the first letter
            for (int j = originalString.length() - 1; j >= 0; j--) {
                char c = originalString.charAt(j);
                if (j == originalString.length() - 1) {
                    reversedString.append(Character.toUpperCase(c));
                } else {
                    reversedString.append(Character.toLowerCase(c));
                }
            }

            resultArray[i] = reversedString.toString();
        }

        return resultArray;
    }

    // print the array
    public static void printArray(String label, String[] array) {
        System.out.println(label);
        for (String element : array) {
            System.out.println("    \"" + element + "\",");
        }
        System.out.println("    End of the array\n");
    }
}
