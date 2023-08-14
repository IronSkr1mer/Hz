package Lesson_22;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lastNames = Arrays.asList("Петров", "Іванов", "Сидоров", "Коваленко", "Смирнов", "Козлов", "Морозов", "Петров", "Іванов", "Коваленко",
                "Сидоров", "Смирнов", "Морозов", "Коваленко", "Іванов", "Сидоров", "Петров", "Іванов", "Морозов", "Коваленко");

        Map<String, Long> lastNameCountMap = lastNames.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println("Мапа прізвищ та їх повторень:");
        lastNameCountMap.forEach((lastName, count) -> System.out.println(lastName + ": " + count));

        List<Integer> randomNumbers = new Random().ints(10, 1, 100) // Генеруємо 10 випадкових чисел від 1 до 99
                .boxed() // Перетворюємо на Stream<Integer>
                .collect(Collectors.toList());

        System.out.println("Список випадкових чисел:");
        randomNumbers.forEach(System.out::println);

        int sum = randomNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сума випадкових чисел: " + sum);
    }
}