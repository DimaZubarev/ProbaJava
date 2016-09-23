package offLine5;

/**
 * Created by Dimon on 19.09.2016.
 */
public class Oders {

    private long id;
    private String itemNames;
    private int price;
    private boolean isActive;
    private boolean isDone;
    private User user;

    public Oders(long id, String itemNames, int price, boolean isActive, boolean isDone) {
        this.id = id;
        this.itemNames = itemNames;
        this.price = price;
        this.isActive = isActive;
        this.isDone = isDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oders oders = (Oders) o;

        if (id != oders.id) return false;
        if (price != oders.price) return false;
        if (isActive != oders.isActive) return false;
        if (isDone != oders.isDone) return false;
        if (itemNames != null ? !itemNames.equals(oders.itemNames) : oders.itemNames != null) return false;
        return user != null ? user.equals(oders.user) : oders.user == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (itemNames != null ? itemNames.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (isDone ? 1 : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}