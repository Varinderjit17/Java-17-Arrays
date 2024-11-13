package arrays;

import java.util.Arrays;

public class ArraysMethods {

    public static void ArrayMethodsDemo() {
        System.out.println("In class ArrayMethods....................");
        int arr1[] = {11,2,33,4,54};
        int arr2[] = Arrays.copyOf(arr1, 4);
        System.out.println("Copied array2" +Arrays.toString(arr2));
        int arr3[] = Arrays.copyOf(arr1, 8);
        System.out.println("Copied array3" +Arrays.toString(arr3));

        Arrays.sort(arr2);
        System.out.println("Sorted array" +Arrays.toString(arr2));
    }
}
