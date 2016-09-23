package offLine2.task1;


public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("man", "Dima", "Zub", 33, "address1", 27000.55);
        Worker worker2 = new Worker("man", "Koly", "Cat", 30, "address2", 6000.60);
        Worker worker3 = new Worker("man", "Koly1", "Cat1", 30, "address3", 600040);
        Worker worker4 = new Worker("man", "Koly2", "Cat2", 30, "address4", 6000.50);
        Worker worker5 = new Worker("woman", "Anna", "Zub", 28, "address1", 16000.80);
        Worker worker6 = new Worker("woman", "Olga", "Zub1", 36, "address5", 10000.50);
        Worker worker7 = new Worker("woman", "Olga1", "Zub2", 36, "address6", 10000);
        Worker worker8 = new Worker("man", "Koly4", "Cat4", 30, "address7", 6000);
        Worker worker9 = new Worker("man", "Koly5", "Cat5", 30, "address8", 6000);
        Worker worker10 = new Worker("man", "Koly6", "Cat6", 30, "address9", 6000);

        Worker[] all= {worker1, worker2, worker3, worker4, worker5, worker6, worker7, worker8, worker9, worker10};

        double sum = 0;
        for(Worker unit: all){         // вмето юнит я могу написаль любое имя например сотрудники, юнит это имя типа данных "Воркер"
            sum = sum += unit.getSalary();
        }
        System.out.println("Sum  all workers" + sum);

        /*int allSum = 0;
        Worker[] allWorkers = new Worker [10];
        for (int i = 0; i < 10; i++) {
            allWorks[i] = new Worker ("man", "Dima", "Zub", 33, "address1", 27000);
        }
        for (int = 0; i < allWorkers.lenght; i++)
        */

    }
}
