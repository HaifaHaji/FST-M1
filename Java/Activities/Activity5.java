package Activities;
/*In this activity we use the Abstract Class to show implementation of Abstraction.

For this activitiy:

Create an abstract class Book that has:
title of type String
an abstract method setTitle() that takes one String argument.
a concrete method getTitle() that returns the value of title.
Create another class that extends the abstract class called MyBook.
MyBook defines the setTitle() method to assign the value of title as the argument.*/


//class book
//Abstract class
abstract class Book {
    String title;

    abstract void setTitle(String h);
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {

    public void setTitle(String h) {
        title = h;
    }
}

public class Activity5 {

    public static void main(String []args) {

        String title = "Cinderella";
        Book obj = new MyBook();
        obj.setTitle(title);
        System.out.println("The title is: " + obj.getTitle());
    }
}