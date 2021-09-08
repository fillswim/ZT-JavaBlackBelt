package P11_OtherImportantThemes.L119_Reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ReflectionEx1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        // 1 вариант создания объекта класса Class
        Class employeeClass = Class.forName("P11_OtherImportantThemes.L119_Reflection.Employee");

        // 2 Вариант создания
//        Class employeeClass2 = Employee.class;

        // 3 Вариант создания
//        Employee employee = new Employee();
//        Class employeeClass3 = employee.getClass();


        // Получение значений полей
//        Field idField = employeeClass.getField("id");
//        System.out.println("Type of id field: " + idField.getType());


        // Получение значений всех полей, кроме privat
//        Field[] fields = employeeClass.getFields();
//        for (Field field : fields) {
//            System.out.println("Type of " + field.getName() + " = " + field.getType());
//        }


        // Получение информации о всех полях, даже privat
//        Field[] fields = employeeClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println("Type of " + field.getName() + " = " + field.getType());
//        }


        // Получение информации о конкретном методу
//        Method method = employeeClass.getMethod("increaseSalary");
//        System.out.println("Return type of method " + method.getName() + " = " + method.getReturnType());
//        System.out.println("Parameter types of method " + method.getName() + " = "
//                + Arrays.toString(method.getParameterTypes()));
//
//        Method method1 = employeeClass.getMethod("setSalary", double.class);
//        System.out.println("Return type of method " + method1.getName() + " = " + method1.getReturnType());
//        System.out.println("Parameter types of method " + method1.getName() + " = "
//                + Arrays.toString(method1.getParameterTypes()));


        // Получение информации обо всех методах
//        Method[] methods = employeeClass.getMethods();
//        for (Method method : methods) {
//            System.out.println("Name of method: " + method.getName() +
//                    ", return type: " + method.getReturnType() +
//                    ", parameter types of method: " + Arrays.toString(method.getParameterTypes()));
//        }

        // Получение информации только о прописанных методах в классе
//        Method[] methods = employeeClass.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println("Name of method: " + method.getName() +
//                    ", return type: " + method.getReturnType() +
//                    ", parameter types of method: " + Arrays.toString(method.getParameterTypes()));
//        }

        // Получение информации только о прописанных методах в классе без private методов
//        Method[] methods = employeeClass.getDeclaredMethods();
//        for (Method method : methods) {
//            if (Modifier.isPublic(method.getModifiers())) {
//                System.out.println("Name of method: " + method.getName() +
//                        ", return type: " + method.getReturnType() +
//                        ", parameter types of method: " + Arrays.toString(method.getParameterTypes()));
//            }
//        }


        // Получение информации о конкретном конструкторе
        Constructor constructor1 = employeeClass.getConstructor();
//        System.out.println("Constructor has " + constructor1.getParameterCount() + " parameters");
//        System.out.println("parameter types are: " + Arrays.toString(constructor1.getParameterTypes()));
//
//        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
//        System.out.println("Constructor has " + constructor2.getParameterCount() + " parameters");
//        System.out.println("parameter types are: " + Arrays.toString(constructor2.getParameterTypes()));


        // Получение информации обо всех конструкторах
        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor " + constructor.getName() +
                    " has " + constructor.getParameterCount() + " parameters" +
                    ", their types are: " + Arrays.toString(constructor.getParameterTypes()));
        }




    }
}
