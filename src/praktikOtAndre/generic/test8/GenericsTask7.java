package praktikOtAndre.generic.test8;

import java.util.Stack;

public class GenericsTask7 <K> {
    Stack<K> stk = new Stack<K>();
    public void push (K obj) {stk.push(obj);}
    public K pop() {
        K obj = stk.pop();
        return obj;
    }
}
