package Lesson_21;

import java.util.Comparator;

public class StudentComparators {
    public static Comparator<Student> lastNameComparator = Comparator.comparing(Student::getLastName);
    public static Comparator<Student> averageGradeComparator = Comparator.comparingDouble(Student::getAverageGrade);
}
