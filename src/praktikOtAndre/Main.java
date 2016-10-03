package praktikOtAndre;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        User user1 = new User(1234, "Dima", "Zub", "Kyiv");
        Item item = new Item();
        item.setName("Audi");
        item.setCityStored("Kyiv");

        controller.makeOrder(user1,item);

    }
}
