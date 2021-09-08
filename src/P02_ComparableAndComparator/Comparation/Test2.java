package P02_ComparableAndComparator.Comparation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(21, "Zaur", "Tregulov", 26);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 20);
        Employee emp3 = new Employee(11, "Ivan", "Sidorov", 23);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting: " + list);

        // Сортировка с помощью интерфейса Comparable<Employee>
//        Collections.sort(list);

        // Сортировка с помощью компаратора Comparator<Employee>
//        Collections.sort(list, new NameSurnameComparator());


        // Сортировка с помощью лямбда-выражения
//        Collections.sort(list, (o1, o2) -> {
//            int result = o1.name.compareTo(o2.name);
//            if (result == 0) {
//                result = o1.surname.compareTo(o2.surname);
//            }
//            return result;
//        });

        System.out.println("After sorting: " + list);

    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}

class NameSurnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int result =  o1.name.compareTo(o2.name);
        if (result == 0) {
            result = o1.surname.compareTo(o2.surname);
        }
        return result;
    }
}
