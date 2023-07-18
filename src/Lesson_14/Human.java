package Lesson_14;

// Батьківський клас "Людина"
class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Привіт, мене звуть " + name);
    }
}

// Клас "Водій", нащадок класу "Людина"
class Driver extends Human implements Driving {
    public Driver(String name) {
        super(name);
    }

    public void drive() {
        System.out.println(name + " водить авто");
    }
}

// Клас "Пілот", нащадок класу "Людина"
class Pilot extends Human implements Flying {
    public Pilot(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + " літає");
    }
}
interface Flying {
    void fly();
}
interface Driving {
    void drive();
}
