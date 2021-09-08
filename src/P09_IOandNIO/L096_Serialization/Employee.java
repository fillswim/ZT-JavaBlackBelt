package P09_IOandNIO.L096_Serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    static final long serialVersionUID = 2;

    String name;
    String department;
    int age;
    transient double salary;
    Car car;

    public Employee(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
