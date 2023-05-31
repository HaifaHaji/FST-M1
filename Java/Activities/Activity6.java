package Activities;
/*Start by creating a class called Plane.
Add a constructor that initializes the values of maxPassengers and the array passengers to an empty array.
Change the access modifier of the four variables to private.
Add the following methods to the Plane class:
onboard(): add passengers to the array using the add() method
takeOff(): returns the current date and time
land(): sets the value of lastTimeLanded to the current date and time. Also clear() the array.
getLastTimeLanded(): returns the value of lastTimeLanded.
getPassesngers(): returns the array of passengers.


Create another class named Activity6. In this class we will have our main method.
First create an object of the Plane class named plane. Set the maxPassengers value to 10 by passing it to the constructor.
Add names to the passengers list using the onboard method.
Print the take-off time using the takeOff() method.
Print the list of passengers using the getPassengers() method.
Add a Thread.sleep() method to pause execution for 5 seconds. This is to emulate plane in flight.
Land() the plane and print the time of landing using getLastTimeLanded() method./


 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        //There is a plane with max 10 passengers
        Plane plane = new Plane(10);
        //Add passengers on the list
        plane.onboard("BOB");
        plane.onboard("LARA");
        plane.onboard("Clary");
        plane.onboard("HARDY");
        //Plane takes off
        System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
        //Flying.....
        Thread.sleep(5000);
        //Plane has landed
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}
