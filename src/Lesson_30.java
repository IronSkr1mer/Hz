public class Lesson_30 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Згенеровано число: " + i);
                if (i == 5) {
                    System.out.println("Потік перервано через число 5.");
                    break;
                }
                Thread.sleep(1000); // Затримка на 1 секунду
            }
        } catch (InterruptedException e) {
            System.out.println("Потік було перервано.");
        }
    }

    public static void main(String[] args) {
        Lesson_30 thread = new Lesson_30();
        thread.start();
    }
}