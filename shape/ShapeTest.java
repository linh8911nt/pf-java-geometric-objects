package shape;

import circle.Circle;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
        System.out.println(shape.toString());

        Circle c = new Circle();
        System.out.println(c.toString());
    }
}
