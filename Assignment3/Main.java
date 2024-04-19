// Abstract class with a constructor, an abstract method, and a normal method
abstract class AbstractClass {
    // Constructor of the abstract class
    public AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    // Abstract method to be implemented by subclasses
    public abstract void a_method();

    // Normal method of the abstract class
    public void normalMethod() {
        System.out.println("This is a normal method of abstract class");
    }
}

// Subclass extending the abstract class and implementing the abstract method
class SubClass extends AbstractClass {
    // Overriding the abstract method from the abstract class
    @Override
    public void a_method() {
        System.out.println("This is abstract method");
    }
}

// Main class with the main method to create an instance of the subclass and call its methods
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the subclass
        SubClass sub = new SubClass();

        // Calling the abstract method of the subclass
        sub.a_method();

        // Calling the normal method of the abstract class through the subclass
        sub.normalMethod();
    }
}