package sections.sec53_Generics.gc1_without_using_generics;

public class IntegerPrinter {
    Integer thingToPrint;

    public IntegerPrinter(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
