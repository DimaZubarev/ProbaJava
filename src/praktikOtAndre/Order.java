package praktikOtAndre;

import java.util.Date;

public class Order {

    private Item item;
    private User user;
    private Date date;
    private static int counter;
    private boolean isActive;  // Активний чи не активний
    private boolean isShipped; // Вже привезли чи ні

    public Order(Item item, User user) {
        this.item = item;
        this.user = user;
        this.date = new Date();
        this.isActive = true;
        this.isShipped = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (isActive != order.isActive) return false;
        if (isShipped != order.isShipped) return false;
        if (!item.equals(order.item)) return false;
        if (!user.equals(order.user)) return false;
        return date.equals(order.date);

    }

    @Override
    public int hashCode() {
        int result = item.hashCode();
        result = 31 * result + user.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (isShipped ? 1 : 0);
        return result;
    }

    public Item getItem() {
        return item;
    }

    public User getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    public static int getCounter() {
        return counter;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isShipped() {
        return isShipped;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static void setCounter(int counter) {
        Order.counter = counter;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setShipped(boolean shipped) {
        isShipped = shipped;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item=" + item +
                ", user=" + user +
                ", date=" + date +
                ", isActive=" + isActive +
                ", isShipped=" + isShipped +
                '}';
    }
}
