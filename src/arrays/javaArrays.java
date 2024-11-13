package arrays;

public class javaArrays {
    public static void javaArraysExample() {
        //arrays declaration

        //size needs to be mentioned otherwise error, size is fixed
        //can't delete or add more elements to array
        int arr[] = new int[7];

        //Array Initializer

        //initialize array with omitting size
        String strArr[] = new String[]{"Rupi", "Aish"};

        //Array initializer with anonymous array
        //omit new and brackets
        int arr2[] = {1,2,3};

        //Run time error - ArrayIndexOutOfBoundException
        //System.out.println(arr2[5]);

        //Enhanced for loop
        String forEachArr[] = {"One","Two", "Three" };
        for (String element: forEachArr
             ) {
            System.out.println("Element "+ element);
        }
    }
}
