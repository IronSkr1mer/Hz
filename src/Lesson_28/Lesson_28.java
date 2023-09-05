package Lesson_28;

import java.lang.reflect.Field;

public class Lesson_28 {
    @MyValidation
    private String name;

    public Lesson_28(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Lesson_28 obj1 = new Lesson_28("John");
        Lesson_28 obj2 = new Lesson_28("");

        validateObject(obj1);
        validateObject(obj2);
    }

    private static void validateObject(Lesson_28 obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MyValidation.class)) {
                field.setAccessible(true);
                try {
                    String value = (String) field.get(obj);
                    if (value == null || value.isEmpty()) {
                        System.out.println(field.getName() + " не пройшло валідацію.");
                    } else {
                        System.out.println(field.getName() + " пройшло валідацію.");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}