package tutorial.adressbook.generics;

public class MainApp {
    public static void main(String[] args) {
        Shape shape = new Square(0,12);
        try {
            shape.area();
        } catch (IllegalStateException anyVariable) {
            anyVariable.printStackTrace();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();;
        } catch (AlineException alineException) {
            alineException.printStackTrace();
        }

        Shape shape1 = new Rectangle(15, 46);

        Rectangle rectangle = (Rectangle)shape1;
        rectangle.printArea();
    }
}
