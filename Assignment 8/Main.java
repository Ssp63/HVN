import java.util.*;

// Define a class representing a Student
class Student {
    private int rollNumber;
    private String name;
    private char gender;

    // Constructor to initialize a Student object
    public Student(int rollNumber, String name, char gender) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gender = gender;
    }

    // Getters for class variables
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    // toString() method to represent Student object as a String
    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of class Student
        Student student1 = new Student(101, "John", 'M');
        Student student2 = new Student(102, "Emily", 'F');
        Student student3 = new Student(103, "Michael", 'M');

        // Perform different operations on various collection components

        // a. ArrayList
        List<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        System.out.println("ArrayList: " + arrayList);

        // b. LinkedList
        List<Student> linkedList = new LinkedList<>();
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
        System.out.println("LinkedList: " + linkedList);

        // c. ArrayDeque
        Deque<Student> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(student1);
        arrayDeque.add(student2);
        arrayDeque.add(student3);
        System.out.println("ArrayDeque: " + arrayDeque);

        // d. PriorityQueue
        Queue<Student> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(Student::getRollNumber));
        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);
        System.out.println("PriorityQueue: " + priorityQueue);

        // e. HashSet
        Set<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        System.out.println("HashSet: " + hashSet);

        // f. TreeSet
        Set<Student> treeSet = new TreeSet<>(Comparator.comparingInt(Student::getRollNumber));
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        System.out.println("TreeSet: " + treeSet);

        // g. HashMap
        Map<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(student1.getRollNumber(), student1);
        hashMap.put(student2.getRollNumber(), student2);
        hashMap.put(student3.getRollNumber(), student3);
        System.out.println("HashMap: " + hashMap);

        // h. LinkedHashMap
        Map<Integer, Student> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(student1.getRollNumber(), student1);
        linkedHashMap.put(student2.getRollNumber(), student2);
        linkedHashMap.put(student3.getRollNumber(), student3);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
