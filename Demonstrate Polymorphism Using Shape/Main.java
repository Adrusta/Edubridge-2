
class Shape {
    void draw() {
        System.out.println("Drawing a Shape");
    }

    void erase() {
        System.out.println("Erasing a Shape");
    }
}

class Circle extends Shape {
    double radius = 5.0;

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
        System.out.println("Radius: " + radius);
    }

    @Override
    void erase() {
        System.out.println("Erasing a Circle");
    }
}

class Triangle extends Shape {
    int base = 10, height = 5;

    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
        System.out.println("Base: " + base + ", Height: " + height);
    }

    @Override
    void erase() {
        System.out.println("Erasing a Triangle");
    }
}

class Square extends Shape {
    int side = 4;

    @Override
    void draw() {
        System.out.println("Drawing a Square");
        System.out.println("Side: " + side);
    }

    @Override
    void erase() {
        System.out.println("Erasing a Square");
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.draw();
        s.erase();

        System.out.println();

        s = new Triangle();
        s.draw();
        s.erase();

        System.out.println();

        s = new Square();
        s.draw();
        s.erase();
    }
}

