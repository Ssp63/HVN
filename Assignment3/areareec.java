import java.lang.Math;

// Abstract class Shape with methods for calculating the area of different shapes
abstract class Shape {
    // Method to calculate the area of a rectangle
    public abstract void RectangleArea(double length, double breadth);

    // Method to calculate the area of a square
    public abstract void SquareArea(double side);

    // Method to calculate the area of a circle
    public abstract void CircleArea(double radius);
}

// Class Area extends Shape and provides implementation for calculating the area of different shapes
class Area extends Shape {
    // Override the RectangleArea method from the Shape class
    @Override
    public void RectangleArea(double length, double breadth) {
        // Print the area of the rectangle
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Override the SquareArea method from the Shape class
    @Override
    public void SquareArea(double side) {
        // Print the area of the square
        System.out.println("Area of Square: " + (side * side));
    }

    // Override the CircleArea method from the Shape class
    @Override
    public void CircleArea(double radius) {
        // Print the area of the circle
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

// Main class to test the Area class
public class areareec {
    // Main method to test the Area class
    public static void main(String[] args) {
        // Create an instance of the Area class
        Area area = new Area();

        // Calculate the area of a rectangle with length 5 and breadth 10
        area.RectangleArea(5, 10);

        // Calculate the area of a square with side 5
        area.SquareArea(5);

        // Calculate the area of a circle with radius 5
        area.CircleArea(5);
    }
}