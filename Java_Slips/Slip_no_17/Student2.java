// Q2. Define a class Student with attributes rollno and name. Define default and parameterized
// constructor. Keep the count of Objects created. Create objects using parameterized constructor and
// Display the object count after each object is created.

public class Student2 {
    private int rollno;
    private String name;
    private static int objectCount = 0;

    public Student2() {
        objectCount++;
    }

    public Student2(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        objectCount++;
        System.out.println("Student object created. Object count: " + objectCount);
    }

    public static void main(String[] args) {
        // Create Student objects using the parameterized constructor
        Student2 s1 = new Student2(1, "saurabh");
        Student2 s2 = new Student2(2, "yogesh");
        Student2 s3 = new Student2(3, "arbaj");

        // Display the final object count
        System.out.println("Total Student objects created: " + objectCount);
    }
}
