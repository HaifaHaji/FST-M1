package Activities;
/*

Create a HashSet named hs.
Add 6 objects using add() method to the HashSet.
Then print the size of the HashSet using the size() method.
Remove an element using the remove() method.
Also try to remove an element that is not present in the Set.
Use the contains() method to check if an item is in the Set or not.
Print the updated set.
 */
import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hshset = new HashSet<String>();
        // Adding element to HashSet
        hshset.add("H");
        hshset.add("A");
        hshset.add("I");
        hshset.add("F");
        hshset.add("A");
        hshset.add("H");

        //Print HashSet
        System.out.println("Original HashSet: " + hshset);
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hshset.size());

        //Remove element
        System.out.println("Removing A from HashSet: " + hshset.remove("A"));
        //Remove element that is not present

        if(hshset.contains("L"))
        {
            hshset.remove("L");
            System.out.println("l is removed");
        }
        else {
            System.out.println("l not present");
        }

        if(hshset.remove("X")) {
            System.out.println("X removed from the Set");
        } else {
            System.out.println("X is not present in the Set");
        }

        //Search for element
        System.out.println("Checking if M is present: " + hshset.contains("A"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hshset);
    }
}