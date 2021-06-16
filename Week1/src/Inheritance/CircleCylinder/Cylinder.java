package Inheritance.CircleCylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getLateralSurfaceArea() {
        return 2 * Math.PI * height * getRadius();
    }

    public double getTotalSurfaceArea() {
        return ((2 * Math.PI * Math.pow(getRadius(), 2)) + (2 * Math.PI * height * getRadius()));
    }

    public String toString() {
        return "A Cylinder with height = "
                + getHeight()
                + ", which is a subclass of "
                + super.toString()
                + "\n Lateral Surface Area = "
                + getLateralSurfaceArea()
                + "\n Total Surface Area = "
                + getTotalSurfaceArea();
    }
}
