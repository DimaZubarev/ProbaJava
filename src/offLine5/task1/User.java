package offLine5.task1;

/**
 * Created by Dimon on 19.09.2016.
 */
public class User {

    private static int counter= 0;

    public User() {
        counter = counter + 1;
    }

    public static int getCounter() {
        return counter;
    }
}
