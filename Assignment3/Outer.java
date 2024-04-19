public class Outer {
    // Static variable in the outer class
    private static int staticVar = 10;

    // Non-static variable in the outer class
    private int nonStaticVar = 20;

    // Static inner class
    static class StaticInner {
        public void accessStaticVar() {
            // Print the value of the static variable in the outer class
            System.out.println("Static variable in outer class: " + staticVar);
        }
    }

    // Non-static inner class
    class NonStaticInner {
        public void accessNonStaticVar() {
            // Print the value of the non-static variable in the outer class
            System.out.println("Non-static variable in outer class: " + nonStaticVar);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the static inner class
        Outer.StaticInner staticInner = new Outer.StaticInner();
        // Call the method to access the static variable
        staticInner.accessStaticVar();
        // Create an instance of the outer class
        Outer outer = new Outer();
        // Create an instance of the non-static inner class
        Outer.NonStaticInner nonStaticInner = outer.new NonStaticInner();
        // Call the method to access the non-static variable
        nonStaticInner.accessNonStaticVar();
    }
}
