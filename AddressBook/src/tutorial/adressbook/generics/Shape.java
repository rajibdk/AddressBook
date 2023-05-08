package tutorial.adressbook.generics;

public abstract class Shape {
    public int length, width;

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }
    abstract int area() throws IllegalStateException, IllegalArgumentException, AlineException;
}
