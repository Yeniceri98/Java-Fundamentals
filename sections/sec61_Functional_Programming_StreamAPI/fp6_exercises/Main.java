package sections.sec61_Functional_Programming_StreamAPI.fp6_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> courses = List.of("React", "Spring Boot", "Spring", "AWS", "SQL");

        List<Integer> numbers = Arrays.asList(4, 5, 6, 10, 25);

        // EX1:
        System.out.println("Print Courses Individually:");
        courses.stream().forEach(System.out::println);
        System.out.println();

        // EX2:
        System.out.println("Print Courses Which Has 'Spring' Word In It:");
        courses.stream()
                .filter(course -> course.contains("Spring"))
                //.forEach(System.out::println);    ALttaki gibi lambdalı da yapabiliriz
                .forEach(course -> System.out.println(course));
        System.out.println();

        // EX3:
        System.out.println("Print Courses Which Has More Than 4 Letters:");
        courses.stream()
                .filter(course -> course.length() > 4)
                .forEach(System.out::println);

        // EX 4:
        System.out.println("Triple the Values:");
        Stream<Integer> data = numbers.stream();    // NOTE: Bu ve aşağıdaki satırda olduğu üzere ayrı bir değişkene de atayabiliriz
        Stream<Integer> mappedData = data.map(n -> n * n * n);
        mappedData.forEach(System.out::println);

        // EX5:
        System.out.println("Filter, Sort and Double the Odd Values");
        numbers.stream()
                .filter(x -> x % 2 != 0)
                .sorted()
                .map(val -> val * val)      // NOTE: filter'da verdiğimiz x değişkenini de verebiliriz farketmiyor
                .forEach(System.out::println);

    }
}

/*
    Arrays.asList()  --->  Java 8
    List.of()        --->  Java 9
*/