class Student {
    private int rollNumber;
    private String name;
    private double percentage;
    private static int objectCount = 0;
    public Student() {
        objectCount++;
    }
    public Student(int rollNumber, String name, double percentage) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.percentage = percentage;
        objectCount++;
    }
    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + "\nName: " + name + "\nPercentage: " + percentage + "%";
    }
    public static int getObjectCount() {
        return objectCount;
    }
}
public class Student1 {
    public static void main(String[] args) {
        Student student1 = new Student(101, "John", 85.5);
        System.out.println("Object Count: " + Student.getObjectCount());
        System.out.println("Student 1 Details:\n" + student1);
        Student student2 = new Student(102, "Alice", 92.0);
        System.out.println("\nObject Count: " + Student.getObjectCount());
        System.out.println("Student 2 Details:\n" + student2);
        Student student3 = new Student();
        System.out.println("\nObject Count: " + Student.getObjectCount());
        System.out.println("Student 3 Details:\n" + student3);
    }
}

