import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class Lesson_26 {
    // Функція для збереження строки у файл
    public static void saveToFile(String text, String filename) {
        try {
            Files.write(Paths.get(filename), text.getBytes(StandardCharsets.UTF_8));
            System.out.println("Строку успішно збережено у файл.");
        } catch (IOException e) {
            System.out.println("Помилка при збереженні у файл: " + e.getMessage());
        }
    }

    // Функція для зчитування даних з файлу та повернення їх
    public static String readFromFile(String filename) {
        StringBuilder content = new StringBuilder();

        try {
            for (String line : Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8)) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні з файлу: " + e.getMessage());
        }

        return content.toString();
    }

    public static void main(String[] args) {
        String filename = "data_nio.txt"; // Ім'я файлу
        String textToSave = "Привіт, це текст для збереження у файл з використанням NIO!";

        saveToFile(textToSave, filename); // Збереження тексту у файл

        String readText = readFromFile(filename); // Зчитування тексту з файлу
        System.out.println("Зчитаний текст з файлу з використанням NIO:");
        System.out.println(readText);
    }
}