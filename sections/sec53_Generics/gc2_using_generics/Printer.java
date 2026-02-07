package sections.sec53_Generics.gc2_using_generics;

public class Printer <T>{           // T: Type of thing. Genelde T kullanılır fakat farklı bir adlandırma da yapılabilir
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
