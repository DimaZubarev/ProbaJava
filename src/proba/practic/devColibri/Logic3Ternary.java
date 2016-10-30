package proba.practic.devColibri;

public class Logic3Ternary {
    public static void main(String[] args) {

        int needFual = 5;
        char drive  = (needFual > 1) ? 'Y' : 'N';
        System.out.println(drive);
        System.out.println("");

//        int mathematics = (int)(Math.random()*11);
//        int physics = (int)(Math.random()*11);
//        int english = (int)(Math.random()*11);
//        String math = (mathematics < 5) ? "Good" : "Bad";
//        String phy = (physics < 5) ? "Good" : "Bad";
//        String eng = (english < 5) ? "Good" : "Bad";
//        System.out.println(math);
//        System.out.println(phy);
//        System.out.println(eng);

        // Це звичайний варіант з if/else

        int mathematics = (int)(Math.random()*11);
        int physics = (int)(Math.random()*11);
        int english = (int)(Math.random()*11);
        if(mathematics < 5)
            System.out.println("Good");
         else
            System.out.println("Bad");
        if(physics < 5)
            System.out.println("Good");
         else
            System.out.println("Bad");
        if(english < 5)
            System.out.println("Good");
         else
            System.out.println("Bad");
    }
}
/* Якщо if/else багато, але їх логіка може заняти всього один рядок, можливо використати ТРОІЧНИЙ оператор (ternary)
1ч: логічний вираз
2ч: перший оператор спрацювує, якщо логічний оператор істинний
3ч: другий оператор спрацювує, якщо логічний оператор помилковий
 */