package P10_RegEx.L114_printf_format;

public class RegExPrintf {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Oleg", "Filatov", 1200, 0.15);
        Employee employee2 = new Employee(15, "Ivan", "Petrov", 1100, 0.11);
        Employee employee3 = new Employee(25, "Mariya", "Sidorova", 1000, 0.12);

        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);

        String newString = String.format(
                "%03d \t %-12s \t %-12s \t %,.1f \n",
                1, "Oleg", "Filatov", 1200 * (1 + 0.15));
        System.out.println();
        System.out.println(newString);

    }

    static void employeeInfo(Employee employee) {
        System.out.printf(
                "%03d \t %-12s \t %-12s \t %,.1f \n",
                employee.id,
                employee.name,
                employee.surname,
                employee.salary * (1 + employee.bonusPct));
    }

}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}
