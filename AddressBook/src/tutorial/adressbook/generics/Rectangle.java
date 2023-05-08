package tutorial.adressbook.generics;

public class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    int area() {
        return length * width;
    }

    public void printArea() {
        System.out.println(area());
    }
}
