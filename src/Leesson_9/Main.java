package Leesson_9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Чтение символа новой строки после чтения числа

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Студент #" + (i + 1));

            System.out.print("Введите имя студента: ");
            String studentName = scanner.nextLine();

            System.out.print("Введите возраст студента: ");
            int studentAge = scanner.nextInt();
            scanner.nextLine(); // Чтение символа новой строки после чтения числа

            System.out.print("Введите идентификатор студента: ");
            String studentId = scanner.nextLine();

            // Создание объекта Student и добавление его в массив students
            students[i] = new Student(studentName, studentAge, studentId);
        }

        System.out.println("Информация о студентах:");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Студент #" + (i + 1));
            students[i].displayInfo();
            System.out.println();
        }

        // Закрытие сканнера
        scanner.close();
    }
}

