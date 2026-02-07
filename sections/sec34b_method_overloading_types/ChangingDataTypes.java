package sections.sec34b_method_overloading_types;

class Calculate {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}
public class ChangingDataTypes {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println(calculate.sum(10, 15));
        System.out.println(calculate.sum(20.5, 30.5));
    }
}
