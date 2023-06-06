public class Lesson_4 {
    public static void main(String[] args) {
        String text = "Hello, World!";

        String upperCase = text.toUpperCase();
        System.out.println("У верхньому регістрі: " + upperCase);

        String lowerCase = text.toLowerCase();
        System.out.println("У нижньому регістрі: " + lowerCase);

        char firstChar = text.charAt(0);
        System.out.println("Перша літера: " + firstChar);

        // Остання літера
        char lastChar = text.charAt(text.length() - 1);
        System.out.println("Остання літера: " + lastChar);
    }
}
