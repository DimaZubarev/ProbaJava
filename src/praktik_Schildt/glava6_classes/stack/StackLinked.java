package praktik_Schildt.glava6_classes.stack;
import java.util.LinkedList;

public class StackLinked <T> {
    private LinkedList<T> items;
    public StackLinked() {
        this.items = new LinkedList<>();
    }
    public void push(T item){
        items.push(item);
    }
    public T pop(){
        return  items.pop();
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }

    @Override
    public String toString() {
        return "StackLinked{" +
                "items=" + items +
                '}';
    }
}
