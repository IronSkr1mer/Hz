package Lesson_15_1;

interface Animal {
    void voice();
}

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Гав-гав!");
    }
}

class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Мяу-мяу!");
    }
}

class Parrot implements Animal {
    @Override
    public void voice() {
        System.out.println("Привіт! Я папуга!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Parrot();

        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
