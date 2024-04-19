 package USefuljav;
public class Useme {
  
    // Method to calculate the area of a shape
    public double area(double length, double width) {
        return length * width;
    }
    
    // Method to calculate percentage
    public double percentage(double totalMarks, double obtainedMarks) {
        return (obtainedMarks / totalMarks) * 100;
    }
}

// Now in your main class or program, you can import the 'useful' package and use the methods from the 'Useme' class.

// import useful.Useme;

// public class Main {
    
//     public static void main(String[] args) {
//         Useme obj = new Useme();
        
//         // Calculate area of a rectangle
//         double area = obj.area(5, 4);
//         System.out.println("Area of rectangle: " + area);
        
//         // Calculate percentage
//         double percentage = obj.percentage(100, 75);
//         System.out.println("Percentage obtained: " + percentage
//     }