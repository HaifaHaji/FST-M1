package Activities;

/*In this activity, 
we are writing a program to check if the sum of all the 10's in the array is exactly 30.
The program returns false if the condition does not satisfy, otherwise returns true.

Instructions:
Add a Class named Activity2.
In the main() method:
Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]
Find the 10's in the array and add them
Check if value is equal to 30.*/


import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        //Initialize the array
        int[] arr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(arr));

        //Set constants
        int search = 10;
        int Sum = 30;

        //Print result
        System.out.println("Result is " + result(arr, search, Sum));
    }

    public  static boolean result(int[] numbers, int search, int Sum) //static method so no object creation
    {
        int temp_sum = 0;
        //Loop through array
        for (int num : numbers) {
            //If value is 10
            if (num == search) {
                //Add them
                temp_sum += search;
            }

            //Sum should not be more than 30
            if (temp_sum > Sum) {
                break;
            }
        }

        //Return true if condition satisfies
        return  temp_sum==Sum;

    }
}
