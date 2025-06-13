public class Logger{

    //1. Creating private static instance.
    private static Logger log;

    //2. Private constructor created.
    private Logger(){
        //Constructor will be ran only once.
    }

    //3. public static method to get instance of the logger class.
    public static Logger getInstance(){
        if (log == null) {
            log = new Logger();
        }
        //creates new instance (if not already exists) and returns it.
        return log;
    }

    //random printing method.
    public void msgLogging(String msg){
        System.out.println("Logged msg: "+ msg);
    }
}
/*
 1. Created private static instance.
 2. Created private constructor.
 3. Created public static method to return the instance.
 4. Created a function to log a message to terminal.
 */