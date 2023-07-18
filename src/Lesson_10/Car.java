package Lesson_10;

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

