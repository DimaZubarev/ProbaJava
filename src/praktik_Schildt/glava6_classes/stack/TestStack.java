package praktik_Schildt.glava6_classes.stack;

public class TestStack {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        StackLinked sl = new StackLinked();

        // додавання чисел в стек
        for (int i = 0; i < 10; i++) stack1.push(i);
        for (int i = 10; i < 20; i++) stack2.push(i);

        // вилучення чисел з стеку
        System.out.println("Вміст stack1:");
        for (int i = 0; i < 10; i++)
           System.out.println(stack1.pop());

        System.out.println("Вміст stack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(stack2.pop());

        sl.push(1);
        sl.push(3);
        System.out.println(sl);
        System.out.println(sl.pop());
        System.out.println(sl.pop());

    }
}
