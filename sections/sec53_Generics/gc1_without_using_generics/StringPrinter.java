package sections.sec53_Generics.gc1_without_using_generics;

public class StringPrinter {
    String thingToPrint;

    public StringPrinter(String thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}