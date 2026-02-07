package sections.sec53_Generics.gc2_using_generics;

public class Main {
    public static void main(String[] args) {
        Printer<Integer> x = new Printer<>(15);     //  Printer<Integer> x = new Printer(15); yapınca da çalışır fakat Printer'ın üstünü highlightlar. Koymakta yarar var
        x.print();

        Printer<String> y = new Printer<>("İstanbul");      // Printer<int> veya Printer<double> şeklinde tanımlayamayız. Primitive yerine yukarıdaki gibi reference type şeklinde kullanılmalıdır (wrapper class olarak geçer)
        y.print();


        // ArrayListler de bu mantıkla çalışır:
        // ArrayList<Cat> cats = new ArrayList<>();
        // cats.add(new Cat());
        // cats.add(new Dog())     // Hata verir


        // Generic Method Call
        shout("Ahmet", 15);
        shout(10, 15.5);

        System.out.println(returningShout(50, "Turkey"));   // 50
    }

    // Generic Method
    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!");
        System.out.println(otherThingToShout + "!");
    }

    // Generic Method Return Type
    private static <T, V> T returningShout(T thingToShout, V otherThingToShout) {
        return thingToShout;
    }

}

