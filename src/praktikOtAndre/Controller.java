package praktikOtAndre;

import java.util.Date;

public class Controller {

    private Store store = new Store("Kyiv");
    private DAOImpl dao = new DAOImpl();

    // Замовлення товару
    public void makeOrder (User user, Item item){
        Order order = new Order(item, user);
        Item[]items = store.getItems();
        for(Item storeItem : items){
            if(storeItem.getCityStored().equals(item.getCityStored()) && storeItem.getName().equals(item.getName()));{
                store.getOrders()[Store.getIndex()] = order; // не можу зрозуміти цю строку
                dao.save(order); // зберігання в базу
                return;
            }
        }

        System.out.println("У нас відсутній цей товар");
    }

    // Скасування заказу
    public void cancelOrder (User user, Item item){
        Order[]orders = store.getOrders();
        for(Order storeOrder : orders){
            if(storeOrder.getUser().equals(user) && storeOrder.getItem().equals(item)){
                storeOrder.setActive(false);
                //TODO  підказка до якою потрібно повернутися
            }
        }
    }



}


