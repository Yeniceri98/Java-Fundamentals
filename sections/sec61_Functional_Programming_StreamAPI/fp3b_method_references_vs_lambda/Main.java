package sections.sec61_Functional_Programming_StreamAPI.fp3b_method_references_vs_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Printer {
    void print(String s) {
        System.out.println(s);
    }
}

class User {
    private String name;

    User (String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        // 1) Static Method Reference
        // ClassName::staticMethod
        Arrays.asList("a", "b", "c").forEach(Main::print);  // Lambda karşılığı: s -> Main.print(s)

        // 2) Instance method reference (belirli bir obje)
        // instance::instanceMethod
        Printer printer = new Printer();
        Arrays.asList("x", "y").forEach(printer::print);    // Lambda karşılığı: s -> printer.print(s)

        // 3) Instance method reference (belirsiz obje – en çok karıştırılan)
        // ClassName::instanceMethod
        Arrays.asList("java", "spring", "spring boot")
                .stream()
                .map(String::toUpperCase)       // Lambda karşılığı: s -> s.toUpperCase()
                .forEach(System.out::println);

        // 4) Constructor Reference
        List<String> names = Arrays.asList("Ahmet", "Sami", "Yeniceri");
        List<User> users = names.stream()
                .map(User::new)
                .collect(Collectors.toList());
    }

    static void print(String s) {
        System.out.println(s);
    }
}

/*
    - Method reference, bir lambda ifadesinin daha kısa, okunabilir ve niyet odaklı yazım şeklidir
    - Var olan bir metodu çağırmadan, referans olarak functional interface’e bağlamanı sağlar
    - Lambda kısaltmasıdır, yeni bir özellik değildir

    Lambda:             list.forEach(s -> System.out.println(s));
    Method Reference:   list.forEach(System.out::println);

    Method reference ne zaman kullanılabilir?
    - Lambda’nın yaptığı iş tek bir metod çağrısı olmalı
    - Method reference’lar yalnızca functional interface’lerle çalışır
*/