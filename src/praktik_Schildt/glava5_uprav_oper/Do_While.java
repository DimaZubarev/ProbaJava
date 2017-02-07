package praktik_Schildt.glava5_uprav_oper;

import java.io.IOException;

public class Do_While {
    public static void main(String[] args) throws IOException{
        char item;
        do {
            System.out.println("Справка по оператору:");
            System.out.println("   1: if");
            System.out.println("   2: switch");
            System.out.println("   3: while");
            System.out.println("   4: do-while");
            System.out.println("   5: for");
            System.out.println("Виберіть потрібний пункт:");
            item = (char) System.in.read();
        }while (item < '1' || item > '5');
        //System.out.println("\n");
        switch (item){
            case '1':
                System.out.println("if:\n");
                System.out.println("if(умова) оператор");
                System.out.println("else оператор");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch(вислів){");
                System.out.println(" case константа:");
                System.out.println(" послідовність операторів");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(умова) оператор;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while(умова);");
                break;
            case '5':
                System.out.println("for:\n" +
                        "");
                System.out.println("for(ініциалізація; умова; ітерація)");
                System.out.println(" оператор;");
                break;
        }
    }
}
