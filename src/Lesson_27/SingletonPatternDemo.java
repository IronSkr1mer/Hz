package Lesson_27;

class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Приватний конструктор, щоб заборонити створення об'єктів ззовні
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Привіт, я єдиний об'єкт Singleton");
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}