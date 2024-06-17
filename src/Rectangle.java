public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    // Customizing the toString method to print the rectangle's area and perimeter
    @Override
    public String toString() {
        return "Rectangle --> |Area: " + area() + ", Perimeter: " + perimeter() + "|";
    }
}