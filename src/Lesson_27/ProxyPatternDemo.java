package Lesson_27;

interface Image {
    void display();
}

class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Завантаження зображення " + filename);
    }

    @Override
    public void display() {
        System.out.println("Показ зображення " + filename);
    }
}

class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");

        // Зображення завантажується лише при першому виклику
        image.display();

        // Зображення не завантажується повторно, воно вже в пам'яті
        image.display();
    }
}