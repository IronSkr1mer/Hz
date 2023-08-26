import java.io.*;

public class Lesson_25 {
    // Функція для збереження строки у файл
    public static void saveToFile(String text, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(text);
            System.out.println("Строку успішно збережено у файл.");
        } catch (IOException e) {
            System.out.println("Помилка при збереженні у файл: " + e.getMessage());
        }
    }

    // Функція для зчитування даних з файлу та повернення їх
    public static String readFromFile(String filename) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні з файлу: " + e.getMessage());
        }

        return content.toString();
    }

    public static void main(String[] args) {
        String filename = "data.txt"; // Ім'я файлу
        String textToSave = "Привіт, це текст для збереження у файл!";

        saveToFile(textToSave, filename); // Збереження тексту у файл

        String readText = readFromFile(filename); // Зчитування тексту з файлу
        System.out.println("Зчитаний текст з файлу:");
        System.out.println(readText);
    }
}
