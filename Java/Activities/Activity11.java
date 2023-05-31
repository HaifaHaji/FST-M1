package Activities;
/*

In this exercise,

Create a Map named colours with integer keys and String values.
Add 5 random colours to it and print the Map to the console.
Remove one colour using the remove() method.
Check if the colour green exists in the Map using the containsValue() method.
Print the size of the Map using the size() method.
 */


import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
        hash1.put(1, "Red");
        hash1.put(2, "Green");
        hash1.put(3, "Green");
        hash1.put(4, "White");
        hash1.put(5, "Black");

        // Print the Map
        System.out.println("The Original map: " + hash1);

        // Remove one colour
        hash1.remove(4);
        // Map after removing a colour
        System.out.println("After removing White: " + hash1);

        // Check if green exists
        if(hash1.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }

        // Print the size of the Map
        System.out.println("Number of pairs in the Map is: " + hash1.size());
    }
}
