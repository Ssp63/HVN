import java.util.Scanner;

public class ass3_1 {
    static double radius;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius of the sphere: ");
        radius = input.nextDouble();
        
        double area = calculateArea();
        double volume = calculateVolume();
        
        System.out.println("Area of the sphere: " + area);
        System.out.println("Volume of the sphere: " + volume);
    }

    public static double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static double calculateVolume() {
        return (4.0/3) * Math.PI * Math.pow(radius, 3);
    }
}
