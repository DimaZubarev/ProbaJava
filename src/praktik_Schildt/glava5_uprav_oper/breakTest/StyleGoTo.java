package praktik_Schildt.glava5_uprav_oper.breakTest;

public class StyleGoTo {
    public static void main(String[] args) {
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("Це оператор third, в якому знаходиться break" + '\n');
                    if (t)break second;
                    System.out.println("Цей текст ви не побачите");
                }
                System.out.println("Цей оператор не буде виконуватися ");
            }
            System.out.println("Це оператор first, який йде за блоком second.");
        }
    }
}
