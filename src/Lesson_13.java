import java.util.Scanner;

abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void introduce();
}

class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Я студент " + getName() + ", " + getAge() + " років, студентський номер: " + getStudentId());
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void introduce() {
        System.out.println("Я викладач " + getName() + ", " + getAge() + " років, предмет: " + getSubject());
    }
}

public class Lesson_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім'я студента: ");
        String studentName = scanner.nextLine();

        System.out.print("Введіть вік студента: ");
        int studentAge = scanner.nextInt();

        System.out.print("Введіть студентський номер: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Читання символу нового рядка після числа

        Student student = new Student(studentName, studentAge, studentId);

        System.out.print("Введіть ім'я викладача: ");
        String teacherName = scanner.nextLine();

        System.out.print("Введіть вік викладача: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine(); // Читання символу нового рядка після числа

        System.out.print("Введіть предмет викладача: ");
        String subject = scanner.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherAge, subject);

        student.introduce();
        teacher.introduce();

        scanner.close();
    }
}
