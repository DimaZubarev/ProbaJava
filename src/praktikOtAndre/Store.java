package praktikOtAndre;

public class Store {

    private Item[] items = new Item [5];
    private Order[] orders = new Order[10];
    private String city;
    private static int index = 0;

    public Store(String city) {
        this.city = city;
    }

    Item item = new Item(1234,"BMW", 175, "Kyiv");
//    items[0] = item;
//    item = new Item(1234,"Audi", 180, "Kyiv");
//    items[1] = item;
//    item = new Item(1234,"Opel", 150, "lviv");
//    items[2] = item;
//    item = new Item(1234,"VW",160,"Odesa");
//    items[3] = item;
//    item = new Item(1234,"Shkoda", 151, "Dnepr");
//    items[4] = item;

    public Order[] getOrders() {
        return orders;
    }

    public static int getIndex() {
        return index;
    }

    public Item[] getItems() {return items;}

    public String getCity() {return city;}

}

