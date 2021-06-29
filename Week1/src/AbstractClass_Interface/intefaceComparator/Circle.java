package AbstractClass_Interface.intefaceComparator;

public class Circle {
    private double radius = 1.0;
    private String color = "green";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color, boolean filled) {
    }

    public Circle(double radius) {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArae() {

        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + ", color: "
                + getColor()
                + "\n Area = "
                + getArae();
    }
}
