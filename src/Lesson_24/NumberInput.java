package Lesson_24;

import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введіть число: ");
                int number = Integer.parseInt(scanner.nextLine());
                System.out.println("Ваше число: " + number);
                break; // Вийдемо з циклу, якщо число введено правильно
            } catch (NumberFormatException e) {
                System.out.println("Помилка! Введіть коректне число.");
            }
        }

        scanner.close();
    }
}
