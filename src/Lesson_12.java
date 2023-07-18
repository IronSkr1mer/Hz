public class Lesson_12 {
    private static int initializationCount = 0;

    static {
        initializationCount++;
        System.out.println("Статичний блок ініціалізації. Ініціалізація #" + initializationCount);
    }

    {
        initializationCount++;
        System.out.println("Нестатичний блок ініціалізації. Ініціалізація #" + initializationCount);
    }

    public Lesson_12() {
        initializationCount++;
        System.out.println("Конструктор. Ініціалізація #" + initializationCount);
    }

    public static void main(String[] args) {
        Lesson_12 obj1 = new Lesson_12();
        Lesson_12 obj2 = new Lesson_12();
    }
}