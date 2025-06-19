public class Test{
    public static void main(String args[]){

        //creating object/ instance of the Logger class
        Logger log1 = Logger.getInstance(); //creates one object 
        Logger log2 = Logger.getInstance(); //returns the same object/ instance as it is already created in the previous line

        //running the printing function
        log1.msgLogging("Logging from first instance");
        log2.msgLogging("Logging from second instance");

        //checking if the two instances are same or not
        System.out.println("Is only one instance created? : (log1==log2)?: "+ (log1==log2));
    }

}
/*
 1. Created a main function, in which:
 2. We attempt to create two instances of the Logger class,
 3. But as it is a singleton pattern, only one instance is created.
 4. Printing if both the references point to the same object.
 5. Calling the msgLogging function.
 */