package P11_OtherImportantThemes.L120_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionEx2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class employeeClass = Class.forName("P11_OtherImportantThemes.L120_Reflection.Employee");

        // Создать объект

        // В ранних версиях
//        try {
//            Employee employee = (Employee) employeeClass.newInstance();
//            System.out.println(employee);
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }

        // Рекомендуемый вариант
        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee employee = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Oleg", "IT");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);

        // Вызываем метод /на чем мы вызываем метод
        method.invoke(obj2, 800.88);
        System.out.println(obj2);

    }
}
