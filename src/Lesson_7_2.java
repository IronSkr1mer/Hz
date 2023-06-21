import java.util.Scanner;

public class Lesson_7_2 {
    public static void main(String[] args) {

        Scanner symbolscanner = new Scanner(System.in);

        System.out.println("Введите символ: ");

        char symbol = symbolscanner.next().charAt(0);

        Scanner countscanner = new Scanner(System.in);

        System.out.println("Введите количество: ");

        int count = countscanner.nextInt();

        printSymbol(symbol, count);
    }

    public static void printSymbol(char symbol, int count){
        for (int i = 0; i < count; i++) {
            System.out.print(symbol); // Вывод символа
        }
        System.out.println();
    }
}
