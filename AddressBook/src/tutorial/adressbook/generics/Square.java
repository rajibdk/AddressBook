package tutorial.adressbook.generics;

import java.io.IOException;

public class Square extends Shape {

    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    int area() throws IllegalStateException, IllegalArgumentException, AlineException {
        if(length != 0) {
            if(length == 9999) {
                throw new IllegalArgumentException(length + " too long");
            }
            return length * length;
        }

        if(width != 0) {
            throw new AlineException();
        }

        throw new IllegalStateException("Width is not expected!!");

    }
}
