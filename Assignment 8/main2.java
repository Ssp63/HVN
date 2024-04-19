import java.util.*;

// Define a class representing a Book
class Book {
    private String isbnNumber;
    private String name;
    private double price;

    // Constructor to initialize a Book object
    public Book(String isbnNumber, String name, double price) {
        this.isbnNumber = isbnNumber;
        this.name = name;
        this.price = price;
    }

    // Getters for class variables
    public String getIsbnNumber() {
        return isbnNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // toString() method to represent Book object as a String
    @Override
    public String toString() {
        return "Book{" +
                "isbnNumber='" + isbnNumber + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class main2 {
    public static void main(String[] args) {
        // Create objects of class Book
        Book book1 = new Book("978-0061120084", "To Kill a Mockingbird", 10.99);
        Book book2 = new Book("978-0544003415", "The Lord of the Rings", 15.99);
        Book book3 = new Book("978-0743273565", "The Great Gatsby", 9.99);

        // Perform different operations on various collection components

        // a. ArrayList
        List<Book> arrayList = new ArrayList<>();
        arrayList.add(book1);
        arrayList.add(book2);
        arrayList.add(book3);
        System.out.println("ArrayList: " + arrayList);

        // b. LinkedList
        List<Book> linkedList = new LinkedList<>();
        linkedList.add(book1);
        linkedList.add(book2);
        linkedList.add(book3);
        System.out.println("LinkedList: " + linkedList);

        // c. ArrayDeque
        Deque<Book> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(book1);
        arrayDeque.add(book2);
        arrayDeque.add(book3);
        System.out.println("ArrayDeque: " + arrayDeque);

        // d. PriorityQueue
        Queue<Book> priorityQueue = new PriorityQueue<>(Comparator.comparingDouble(Book::getPrice));
        priorityQueue.add(book1);
        priorityQueue.add(book2);
        priorityQueue.add(book3);
        System.out.println("PriorityQueue: " + priorityQueue);

        // e. HashSet
        Set<Book> hashSet = new HashSet<>();
        hashSet.add(book1);
        hashSet.add(book2);
        hashSet.add(book3);
        System.out.println("HashSet: " + hashSet);

        // f. TreeSet
        Set<Book> treeSet = new TreeSet<>(Comparator.comparingDouble(Book::getPrice));
        treeSet.add(book1);
        treeSet.add(book2);
        treeSet.add(book3);
        System.out.println("TreeSet: " + treeSet);

        // g. HashMap
        Map<String, Book> hashMap = new HashMap<>();
        hashMap.put(book1.getIsbnNumber(), book1);
        hashMap.put(book2.getIsbnNumber(), book2);
        hashMap.put(book3.getIsbnNumber(), book3);
        System.out.println("HashMap: " + hashMap);

        // h. LinkedHashMap
        Map<String, Book> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(book1.getIsbnNumber(), book1);
        linkedHashMap.put(book2.getIsbnNumber(), book2);
        linkedHashMap.put(book3.getIsbnNumber(), book3);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
 
