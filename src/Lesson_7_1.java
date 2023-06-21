import java.util.Scanner;

public class Lesson_7_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt(); // Заданное число
        int cube = calculateCube(number);// Вызываем метод calculateCube() и сохраняем результат в переменной cube

        System.out.println("Куб числа " + number + " равен: " + cube);
    }

    public static int calculateCube(int num) {
        int cube = num * num * num; // Возводим число в куб, умножая его само на себя два раза
        return cube; // Возвращаем результат (куб числа)
    }
}
