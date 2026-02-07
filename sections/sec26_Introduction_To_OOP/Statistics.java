package sections.sec26_Introduction_To_OOP;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum = this.sum + number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return (double) this.sum / this.count;      // NOTE: int/int yaparken double sonuç vermesi için "casting" yaptık. return this.sum / (double) this.count; şeklinde de yapabiliriz
    }

}


/*
    PART 1: Count
    a method "addNumber" adds a new number to the statistics
    a method "getCount" tells the number of added numbers
*/
/*
    PART 2: Sum and Average
    the "sum" method tells the sum of the numbers added (the sum of an empty number statistics object is 0)
    the "average" method tells the average of the numbers added (the average of an empty number statistics object is 0
*/