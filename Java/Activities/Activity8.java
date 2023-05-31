package Activities;
/*
In this activity, we create a custom Exception handler.

Create a class named CustomException that extends the Exception class.
Add a private String variable named message that is going to be the exception message.
Add constructor that initializes the message variable with the custom String passed in.
Add an Override annotation for getMessage() that returns the custom message.


 */
class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity8 {
    public static void main(String[] a){
        try {
            // Method call with correct input
            Activity8.exceptionTest("Will print to console");
            // Method call with incorrect input
            Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException exp) {
            System.out.println("Inside catch block: " + exp.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}

