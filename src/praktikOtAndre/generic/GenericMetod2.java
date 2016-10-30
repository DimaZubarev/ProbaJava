package praktikOtAndre.generic;
public class GenericMetod2 {

    private static <I> void printArray (I[] allArray) {
        for(I element : allArray)
            System.out.print(element + " ");
        System.out.println(" ");
    }

    public static void main(String[] args) {

        Integer [] intArray = {1, 2, 3, 4, 5};
        Double [] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character [] charArray = {'A', 'B', 'C', 'D', 'E'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
