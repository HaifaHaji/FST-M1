package Activities;
/*Activity 1
In this activity, you will be testing an ArrayList with elements:

Create a JUnit test with the name Activity1.java.
Create a test fixture that declares a static ArrayList named list.
Create a setUp() method with the @BeforeAll annotation. Add the following to the setUp() method:

Create 2 @Test methods, insertTest() and replaceTest().
In insertTest(),
Write an assertion to check the size of the ArrayList. The expected value is 2.
Add a new value to the list and write another assertion to check the size of the new list. The expected values of the
 list should be 3.
Finally write assertions for checking each of the values in the ArrayList.

In replaceTest(),
Write an assertion to check the size of the ArrayList. The expected value is 2.
Add a new value to the list and write another assertion to check the size of the new list. The expected values
 of the list should be 3.
Finally, use the ArrayList set() method to replace the value on index 1 to a different value.
Write an assertion to assert the values of the ArrayList.
 */


import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

        // Test fixtures
        static ArrayList<String> list;

        // Initialize test fixtures before each test method
        @BeforeEach
        void setUp() throws Exception {
            list = new ArrayList<String>();
            list.add("alpha"); // at index 0
            list.add("beta"); // at index 1
        }

        // Test method to test the insert operation
        @Test
        public void insertTest() {
            // Assertion for size
            assertEquals(2, list.size(), "Wrong size");
            // Add new element
            list.add(2, "charlie");
            // Assert with new elements
            assertEquals(3, list.size(), "Wrong size");

            // Assert individual elements
            assertEquals("alpha", list.get(0), "Wrong element");
            assertEquals("beta", list.get(1), "Wrong element");
            assertEquals("charlie", list.get(2), "Wrong element");
        }

        // Test method to test the replace operation
        @Test
        public void replaceTest() {
            // Replace new element
            list.set(1, "charlie");

            // Assert size of list
            assertEquals(2, list.size(), "Wrong size");
            // Assert individual elements
            assertEquals("alpha", list.get(0), "Wrong element");
            assertEquals("charlie", list.get(1), "Wrong element");
        }
    }

