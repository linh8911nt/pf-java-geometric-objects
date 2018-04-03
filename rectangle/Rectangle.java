package rectangle;

import shape.Shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(double width, double height){
        return width * height;
    }

    public double getPerimeter(double width, double height){
        return (width + height) / 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + this.width +
                ", height=" + this.height +
                '}' + "area = " + getArea(width, height) + " perimeter = " + getPerimeter(width, height);
    }
}
