package P07_Stream.L52_MethodChaining;

import java.util.stream.Stream;

public class MethodChainingEx {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

//        // Демонстрация конечных (terminal) методов
//        stream
//                .filter(integer -> {
//                    System.out.println("!!!");
//                    return integer % 2 == 0;
//                })
//                .collect(Collectors.toList());


//        // Объединение потоков (concat)
//        // concat не может быть использован в цепочке
//        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
//        Stream<Integer> stream3 = Stream.of(6, 7, 8, 9, 10);
//        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
//        stream4.forEach(System.out::println);

//        // Возвращает стрим уникальных элементов (distinct)
//        // Проверка идет с помощью метода equals
//        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
//        stream5.
//                distinct().
//                forEach(System.out::println);

//        // Считает количество элементов в потоке (count)
//        // Возвращает Long
//        System.out.println(stream.count());

//        // Сколько уникальных элементов содержится в потоке
//        System.out.println(stream.distinct().count());

        // Показывает предварительные результаты как проходит цепочка потока (peek)
        System.out.println(
                stream
                        .distinct()
                        .peek(System.out::println)
                        .count());

    }
}
