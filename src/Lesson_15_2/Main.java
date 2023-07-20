package Lesson_15_2;

public class Main {
    public static void main(String[] args) {
        // Параметризований клас Pair з цілими числами
        Pair<Integer, Integer> intPair = new Pair<>(10, 20);
        System.out.println("Перший елемент: " + intPair.getFirst());
        System.out.println("Другий елемент: " + intPair.getSecond());

        // Параметризований клас Pair з рядками
        Pair<String, String> stringPair = new Pair<>("Привіт", "Світ");
        System.out.println("Перший елемент: " + stringPair.getFirst());
        System.out.println("Другий елемент: " + stringPair.getSecond());

        // Параметризований клас Pair з об'єктами
        Pair<String, Integer> objPair = new Pair<>("OpenAI", 2023);
        System.out.println("Перший елемент: " + objPair.getFirst());
        System.out.println("Другий елемент: " + objPair.getSecond());
    }
}
