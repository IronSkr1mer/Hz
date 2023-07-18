package Lesson_14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім'я водія: ");
        String driverName = scanner.nextLine();

        System.out.print("Введіть ім'я пілота: ");
        String pilotName = scanner.nextLine();

        Human human1 = new Driver(driverName);
        human1.introduce();
        ((Driver) human1).drive();

        Human human2 = new Pilot(pilotName);
        human2.introduce();
        ((Pilot) human2).fly();

        scanner.close();
    }
}