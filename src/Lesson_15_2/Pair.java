package Lesson_15_2;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Метод для отримання першого елемента
    public T getFirst() {
        return first;
    }

    // Метод для отримання другого елемента
    public U getSecond() {
        return second;
    }
}

