class Person {
    String name;
    int age;
    int salary;
}

public class PersonObject {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Sneha Kumari";
        p1.age = 18;
        p1.salary = 9000000;
        System.out.println(p1.name + " "+"salary is " + p1.salary+"per annum");
    }
}
