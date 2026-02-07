package sections.sec61_Functional_Programming_StreamAPI.fp4_map_method;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 5, 6, 8, 10, 13, 20);
        printSquaresOfEvenNumbers(numbers);

        List<String> cities = List.of("Turkey", "England", "Germany", "USA");
        printTheLengthOfCities(cities);
    }

    private static void printSquaresOfEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .forEach(System.out::println);
    }

    private static void printTheLengthOfCities(List<String> cities) {
        cities.stream()
                .map(city -> city + " - Length: " + city.length())
                .forEach(System.out::println);
    }
}

/*
    map() metodu bir değeri alıp bunu başka bir değere çevirmeye yarar
    Örneğin ilk örnekte .filter() ile çift sayıları alıp .map() ile 2 katını alarak döndürdük ve .forEach() ile tek tek bastırdık
*/