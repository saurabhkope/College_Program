// Q2. Write a class Student with attributes roll no, name, age and course.
//  Initialize values through parameterized constructor. 
//  If age of student is not in between 15 and 21 then 
//  generate userdefined exception ―Age Not Within The Range.

 // Custom exception for age not within the range
class AgeNotWithinTheRange extends Exception {
    public AgeNotWithinTheRange(String message) {
        super(message);
    }
}

// Student class with attributes and parameterized constructor
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinTheRange {
        this.rollNo = rollNo;
        this.name = name;

        // Check if the age is within the specified range
        if (age < 15 || age > 21) {
            throw new AgeNotWithinTheRange("Age is not within the range of 15 to 21");
        }

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
            // Create a student with valid age
            Student student1 = new Student(1, "saurabh", 20, "Science");
            student1.display();

            // Create a student with age not within the range
            Student student2 = new Student(2, "yogesh", 21, "Math");
            student2.display(); // This will not be executed if an exception is thrown
        } catch (AgeNotWithinTheRange e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
