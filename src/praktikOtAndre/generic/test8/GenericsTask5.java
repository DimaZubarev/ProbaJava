package praktikOtAndre.generic.test8;
import java.util.Stack;

public class GenericsTask5<E> {

    Stack<E> stk = new Stack<E>();
    public void push(E obj) {
       stk.push(obj);
    }
    public E pop(){
        E obj = stk.pop();
        return obj;
    }
}
