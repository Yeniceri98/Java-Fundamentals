package sections.sec26_Introduction_To_OOP;

public class Film {
    private String name;
    private int ageRating;

    public Film(String name, int ageRating) {
        this.name = name;
        this.ageRating = ageRating;
    }

    public String printName() {
        return name;
    }

    // printName ile aynı işlevi görür. Best practice olarak aşağıdaki gibi setter ve getter kullanılır
    public String getName() {
        return name;
    }

    public int ageRating() {
        return ageRating;
    }
}
