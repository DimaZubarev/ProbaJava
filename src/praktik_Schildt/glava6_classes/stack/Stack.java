package praktik_Schildt.glava6_classes.stack;

public class Stack {
    int stck[] = new int[10];
    int tos;
    Stack(){
        tos = -1;
    }
    // додати елемент до стеку
    void push(int item){
        if(tos == 9)
            System.out.println("Стек вже повний.");
         else
            stck[++tos] = item;
    }
    // забрати елемент із стеку
    int pop(){
        if(tos < 0){
            System.out.println("Стек вже порожній");
            return 0;
        } else
            return stck[tos--];
    }
}
