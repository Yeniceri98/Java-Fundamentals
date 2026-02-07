package sections.sec61_Functional_Programming_StreamAPI.fp3_lambda_expression;

/*
    Yalnızca bir abstract methodu olan interface'e "Functional Interface" denir
    Anotasyon eklemek zorunda değiliz
    Lambda expression da Functional Interface implementasyonunu sağlar
    Lambda expressions, esasen anonymous veya unnamed bir yöntemdir
    Lambda expression'lar kendi başına yürütülmez. Bunun yerine, functional interface tarafından tanımlanan bir yöntemi implement etmek için kullanılır

    Without Lambda Expression:
    double getPiValue() {
        return 3.1415;
    }

    Lambda Expression:
    () -> 3.1415
*/

@FunctionalInterface
interface MyInterface {
    double getPiValue();
}

public class Main {
    public static void main(String[] args) {
        MyInterface ref;

        ref = () -> 3.14;

        System.out.println("Value of PI = " + ref.getPiValue());
    }
}
