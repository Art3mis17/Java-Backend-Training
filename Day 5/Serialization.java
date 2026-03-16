package day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {;

    int id;
    String name;
    int salary;
    String designation;

    // Completed constructor with all fields
    public Student(int id, String name, int salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }
}

public class Serialization {

    static final String FILE_PATH = "C:/fullstack-course/java-course/test/src/day5/student";

    static void serialize() {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Student s = new Student(101, "Rahul", 50000, "Programmer");
            oos.writeObject(s);
            System.out.println("Object Serialized Successfully");
            System.out.println("Stored -> ID: " + s.id + ", Name: " + s.name
                    + ", Salary: " + s.salary + ", Designation: " + s.designation);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deserialize() {
        try (FileInputStream fis = new FileInputStream(FILE_PATH);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Student s = (Student) ois.readObject();
            System.out.println("\nObject Deserialized Successfully");
            System.out.println("ID          : " + s.id);
            System.out.println("Name        : " + s.name);
            System.out.println("Salary      : " + s.salary);
            System.out.println("Designation : " + s.designation);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        serialize();
        deserialize();
    }
}
