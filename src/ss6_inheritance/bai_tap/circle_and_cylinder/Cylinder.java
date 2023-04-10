package ss6_inheritance.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {

    private double width = 1.0, height = 1.0;

    public Cylinder(){

    }

    public Cylinder(double radius, String color, double width, double height) {
        super(radius, color);
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

    public double getVolumn() {
        return height * (getRadius() * getRadius()) * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "width= " + width + ", height= " + height + "---" + super.toString() + "\n V = "  + getVolumn() + " (cm3)";
    }
}
