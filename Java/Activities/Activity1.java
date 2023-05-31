package Activities;
//import Activities.Car;
/*Create 2 Classes, Activity1 and Car in your activities package.
       IN the class Activity1, create an Object of the Car class
Initialize the values of
make to 2014
color to "Black"
transmission to "Manual"
Call the methods in the Car class to print the characteristics of the car, and what happens when
 you accelerate() and brake().
*/
public class Activity1 {
    public static void main(String args[]) {


    Car obj = new Car();
        System.out.println(obj.tyres+""+ obj.doors);
    obj.make =2014;
        System.out.println(obj.make);
    obj.color="Black";
        System.out.println(obj.color);
        obj.displayCharacterstics();
        obj.accelerate();
}}


