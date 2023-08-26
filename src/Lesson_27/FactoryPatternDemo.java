package Lesson_27;

// Інтерфейс фабрики
interface ShapeFactory {
    Shape createShape();
}

// Конкретні фабрики
class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}

// Інтерфейс фігури
interface Shape {
    void draw();
}

// Конкретні реалізації фігур
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Малюю коло");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Малюю квадрат");
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();
    }
}