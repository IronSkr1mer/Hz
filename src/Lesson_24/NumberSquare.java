package Lesson_24;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NumberSquare {
    public static void main(String[] args) {
        try {
            int number = -5; // Зміни це число для тестування
            int square = calculateSquare(number);
            System.out.println("Квадрат числа " + number + ": " + square);
        } catch (NegativeNumberException e) {
            System.out.println("Помилка! " + e.getMessage());
        }
    }

    public static int calculateSquare(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Число менше нуля!");
        }
        return number * number;
    }
}