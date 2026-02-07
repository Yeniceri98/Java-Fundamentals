package sections.sec72_SOLID;

/*
    BAD IMPLEMENTATION:

    class Bird {
        public void fly() {
            System.out.println("Flying");
        }
    }

    class Ostrich extends Bird {
        @Override
        public void fly() {
            throw new UnsupportedOperationException();  // Ostrich cannot fly!
        }
    }

*/

interface Bird {
}

interface FlyingBird extends Bird {
    void fly();
}

interface NonFlyingBird extends Bird {
    void move();
}

class Sparrow implements FlyingBird {
    public void fly() {
        System.out.println("Sparrow flying");
    }
}

class Ostrich implements NonFlyingBird {
    @Override
    public void move() {
        System.out.println("Ostrich move");
    }
}

public class LiskovSubstitution {
    public static void main(String[] args) {
        FlyingBird flyingBird = new Sparrow();
        NonFlyingBird nonFlyingBird = new Ostrich();

        flyingBird.fly();
        nonFlyingBird.move();
    }
}

// Alt sınıflar, üst sınıfların yerine sorunsuz geçebilmelidir. Parent beklenen her yerde child çalışabilmelidir