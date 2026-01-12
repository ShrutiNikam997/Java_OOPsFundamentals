import java.util.*;

class Student {
    String name;
    int RollNo;
    int age;

    Student() {
        System.out.println("Default constructor is called");
    }

    Student(String name, int RollNo, int age) {
        this.name = name;
        this.RollNo = RollNo;
        this.age = age;

    }

    /*
     * else we can do
     * Student(String n, int RN, int a) {
     * this.name = n;
     * this.RollNo = RN;
     * this.age = a;
     * 
     * }
     * 
     */

    void Display() {
        System.out.println("Name of student:" + name);
        System.out.println("Roll No of Student:" + RollNo);
        System.out.println("Age of student :" + age);
    }

}

public class ClassObjectDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Shruti";
        s1.RollNo = 123;
        s1.age = 21;
        s1.Display();

        Student s2 = new Student("Samata", 122, 22);
        s2.Display();

        Student s3 = s2;
        s3.name = "Jaggu";
        s3.Display();
    }
}