package Leesson_9;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Student
        Student student = new Student("John Doe", 20, "S1234567");
        student.displayInfo();  // Вывод информации о студенте

        // Создание объекта Teacher
        Teacher teacher = new Teacher("Jane Smith", 35, "T9876543");
        teacher.displayInfo();  // Вывод информации о викладач
    }
}
