package P00_My.EqualsAndHashCode;

import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        // В классе String метод equals() переопределен
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("String:");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println("Car:");
        Car car1 = new Car("red", "V4");
        Car car2 = new Car("red", "V4");
        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));
        System.out.println(Objects.equals(car1, car2));


    }
}

class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, engine);
    }
}
