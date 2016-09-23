package offLine5.task1;


import offLine5.task1.User;

public class MainUser {
    public static void main(String[] args) {
        System.out.println("first user counter = " + User.getCounter());

        new User();
        new User();
        new User();
        new User();

    }
}
