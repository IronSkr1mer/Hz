package Lesson_21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Петров", generateRandomGrade()));
        students.add(new Student("Іванов", generateRandomGrade()));
        students.add(new Student("Сидоров", generateRandomGrade()));

        // Вивід оригінального списку
        System.out.println("Оригінальний список:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортування за прізвищем
        Collections.sort(students, StudentComparators.lastNameComparator);
        System.out.println("\nСписок відсортований за прізвищем:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортування за середнім балом
        Collections.sort(students, StudentComparators.averageGradeComparator);
        System.out.println("\nСписок відсортований за середнім балом:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static double generateRandomGrade() {
        Random random = new Random();
        return random.nextInt(5) + 1; // Генерируем случайное число от 1 до 5
    }
}