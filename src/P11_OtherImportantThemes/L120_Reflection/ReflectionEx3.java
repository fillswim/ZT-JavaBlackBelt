package P11_OtherImportantThemes.L120_Reflection;

import java.lang.reflect.Field;

public class ReflectionEx3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Oleg", "IT");

        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");

        // Получение доступа к приватному полю
        field.setAccessible(true);

        double salaryValue = (double) field.get(employee);
        System.out.println(salaryValue);

        // Изменение поля
        field.set(employee, 1500);
        System.out.println(employee);

    }
}
