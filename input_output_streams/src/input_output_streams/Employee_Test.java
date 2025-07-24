package input_output_streams;

import java.io.*;
import java.util.Date;

// Employee class must implement Serializable
class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // for version control of serialized data

    private String name;
    private Date joiningDate;
    private String department;
    private String designation;
    private double salary;

    // Constructor
    public Employee(String name, Date joiningDate, String department, String designation, double salary) {
        this.name = name;
        this.joiningDate = joiningDate;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Override toString() for readable output
    @Override
    public String toString() {
        return "Name: " + name +
               "\nJoining Date: " + joiningDate +
               "\nDepartment: " + department +
               "\nDesignation: " + designation +
               "\nSalary: " + salary;
    }
}

public class Employee_Test {
    public static void main(String[] args) {
        // Creating Employee object
        Employee emp = new Employee("Lalitha", new Date(), "CSE", "Developer", 50000.0);

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data"))) {
            out.writeObject(emp);
            System.out.println("Employee object has been serialized to 'data' file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data"))) {
            Employee deserializedEmp = (Employee) in.readObject();
            System.out.println("\nDeserialized Employee:");
            System.out.println(deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
