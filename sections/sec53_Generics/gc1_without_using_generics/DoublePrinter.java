package sections.sec53_Generics.gc1_without_using_generics;

public class DoublePrinter {
    Double thingToPrint;

    public DoublePrinter(Double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}