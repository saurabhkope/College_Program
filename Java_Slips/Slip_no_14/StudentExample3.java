// Q2. Write a class Student with attributes roll no, name, age and course. Initialize values through
// parameterized constructor. If student's roll no of is not in between 13001 to 13080 thengenerate
// user- defined exception ―Rollno is Not Within The Range. 

// Custom exception for roll number not within the range
class RollnoNotWithinTheRange extends Exception {
    public RollnoNotWithinTheRange(String message) {
        super(message);
    }
}

// Student class with attributes and parameterized constructor
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws RollnoNotWithinTheRange {
        if (rollNo < 13001 || rollNo > 13080) {
            throw new RollnoNotWithinTheRange("Roll no is not within the range of 13001 to 13080");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentExample3 {
    public static void main(String[] args) {
        try {
            // Create a student with a valid roll number
            Student student1 = new Student(13015, "saurabh", 18, "Science");
            student1.display();

            // Create a student with a roll number not within the range
            Student student2 = new Student(13100, "arbaj", 20, "english");
            student2.display(); // This will not be executed if an exception is thrown
        } catch (RollnoNotWithinTheRange e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
