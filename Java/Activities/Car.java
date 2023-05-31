package Activities;
/*In the Car class, add these variables:
        A String color
        A String transmission
        An int make
        An int tyres
        An int doors
        Make a constructor to initialize tyres to 4 and doors to 4
         The Car class will not have the main() method.
        Create these methods:
        displayCharacteristics() - This displays the values of all the variables
        accelarate() - This prints "Car is moving forward."
        brake() - This prints "Car has stopped."
        In*/

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

     Car()
    {
        System.out.println("call constructor");
        tyres=4;
        doors=4;
    }




    public void displayCharacterstics() {
        System.out.println(color+""+transmission+""+tyres+""+doors);

    }

    public void accelerate() {
        System.out.println("Car is moving");
    }
}

