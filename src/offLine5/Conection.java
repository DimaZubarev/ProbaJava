package offLine5;

/**
 * Created by Dimon on 19.09.2016.
 */
public class Conection {
    private static Conection INSTANCE;

//    static {
//        INSTANCE = new Conection();
//    }

    public Conection() {
    }

    public static Conection getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Conection();
        }
        return INSTANCE;
    }

   // public static User getUser()

}
