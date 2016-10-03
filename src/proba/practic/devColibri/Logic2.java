package proba.practic.devColibri;

public class Logic2 {

    static int a = 5;
    static int b = 6;
   static boolean bool = false;

    public static void main(String[] args) {

        if(!(a == b) && !bool){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    /* && - оператор "и" значение с двух сторон должны быть истенны
       || - оператор "или" хотябы одно из двух значений должно быть истенным
       ! - оператор нет
       Если в () скобках после if условие истенно, то выполняется условие в {} скобках, если нет, то операция переходит
       дальше к else и выполняются его условия в {} скобках.
     */
}
