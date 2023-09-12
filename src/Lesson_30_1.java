import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lesson_30_1 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // Генеруємо випадкове число від 1 до 50
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;
        return randomNumber;
    }

    public static void main(String[] args) throws Exception {
        // Створюємо пул потоків з 10 потоками
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Створюємо список для зберігання майбутніх результатів
        // (випадкових чисел)
        Future<Integer>[] futureResults = new Future[10];

        // Запускаємо 10 задач для генерації випадкових чисел
        for (int i = 0; i < 10; i++) {
            Callable<Integer> callable = new Lesson_30_1();
            futureResults[i] = executorService.submit(callable);
        }

        // Отримуємо та виводимо результати
        for (int i = 0; i < 10; i++) {
            int randomNumber = futureResults[i].get();
            System.out.println("Випадкове число " + (i + 1) + ": " + randomNumber);
        }

        // Завершуємо пул потоків
        executorService.shutdown();
    }
}