package sections.sec34_Overloading_Methods_and_Constructors;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increase() {
        value++;
    }

    public void increase(int increaseBy) {
        value = value + increaseBy;
    }

    public void decrease() {
        value--;
    }

    public void decrease(int decreaseBy) {
        value = value - decreaseBy;
    }
}
