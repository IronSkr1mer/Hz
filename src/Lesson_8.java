import java.util.Scanner;
public class Lesson_8 {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // Создание массива из 10 элементов
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 10 чисел:");

        // Заполнение массива числами, введенными пользователем
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Считываем число с помощью Scanner
        }

        // Нахождение минимального и максимального чисел в массиве
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length; // Вычисление среднего значения

        // Вывод элементов массива в консоль
        System.out.println("Элементы массива:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Вывод минимального и максимального чисел
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

        // Вывод суммы и среднего значения
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Среднее значение: " + average);

        scanner.close(); // Закрываем Scanner
    }
}
