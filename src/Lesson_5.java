import javax.swing.*;

public class Lesson_5
{
    public static void main(String[] args) {
        int a = 12;
        int b = 10;

        if (a < b) {
            System.out.println(a + " < " + b);
        } else if (b < a) {
            System.out.println(a + " > " + b);
        } else {
            System.out.println(a + " = " + b);
        }
    }
}
