package Leesson_9;

public class Teacher {
    // Поля класса (характеристики викладача)
    private String name;
    private int age;
    private String teacherId;

    // Конструктор класса
    public Teacher(String name, int age, String teacherId) {
        this.name = name;
        this.age = age;
        this.teacherId = teacherId;
    }

    // Методы доступа (геттеры и сеттеры) для доступа к полям класса
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    // Метод для вывода информации о викладаче
    public void displayInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Teacher ID: " + teacherId);
    }
}
