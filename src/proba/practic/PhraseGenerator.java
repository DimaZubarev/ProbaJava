package proba.practic;
// генератор випадкових фраз

public class PhraseGenerator {
    public static void main(String[] args) {
        String [] textListOne = {"Слава", "Київ", "Дніпро", "Степ", "Річка"};
        String [] textListTwo = {"Україна", "Карпати", "Козаки", "Герої", "Соколи"};
        String [] textListThree = {"Вишиванка", "Кобза", "Гетьман", "Сокіл", "Спів"};

        int oneLength = textListOne.length;
        int twoLength = textListTwo.length;
        int threeLength = textListThree.length;

        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLength);

        String phraseGenerator = textListOne[random1] + ", " + textListTwo[random2] + ", " + textListThree[random3];

        System.out.println("Патріоти кажуть " + phraseGenerator);
    }
}
