package Lesson_21;

public class Student {
    private String lastName;
    private double averageGrade;

    public Student(String lastName, double averageGrade) {
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}