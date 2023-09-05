import java.util.Scanner;

public class Lesson_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву потоку: ");
        String threadName = scanner.nextLine();

        Thread thread1 = new Thread(new NumberPrinter(1, 10, threadName + " 1"));
        Thread thread2 = new Thread(new NumberPrinter(1, 10, threadName + " 2"));

        thread1.start();
        thread2.start();
    }
}

class NumberPrinter implements Runnable {
    private final int start;
    private final int end;
    private final String threadName;

    public NumberPrinter(int start, int end, String threadName) {
        this.start = start;
        this.end = end;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(threadName + ": " + i);
        }
    }
}
