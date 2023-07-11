package Lesson_10;

// Батьківський клас "Автомобіль"
class Car {
    public String getType() {
        return "Автомобіль";
    }
}

// Підклас "Легковий автомобіль"
class LightCar extends Car {
    @Override
    public String getType() {
        return "Легковий автомобіль";
    }
}

// Підклас "Вантажний автомобіль"
class Truck extends Car {
    @Override
    public String getType() {
        return "Вантажний автомобіль";
    }
}

// Приклад використання
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        LightCar passengerCar = new LightCar();
        Truck cargoTruck = new Truck();

        System.out.println(car.getType());              // Виведе: "Автомобіль"
        System.out.println(passengerCar.getType());     // Виведе: "Легковий автомобіль"
        System.out.println(cargoTruck.getType());       // Виведе: "Вантажний автомобіль"
    }
}