package sections.sec27_Objects_and_References;

public class Apartment {
    private String aptName;
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(String aptName, int rooms, int squares, int pricePerSquare) {
        this.aptName = aptName;
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public String getAptName() {
        return aptName;
    }

    public boolean largerThan(Apartment compared) {
        boolean isLarger = false;

        if (squares > compared.squares) {
            isLarger = true;
        }

        return isLarger;
    }

    public int priceDifference(Apartment compared) {
        int difference = 0;
        int price = 0;
        int comparedPrice = 0;

        price = pricePerSquare * squares;
        comparedPrice = compared.pricePerSquare * compared.squares;
        difference = price - comparedPrice;

        return Math.abs(difference);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        boolean isMoreExpensive = false;

        int price = 0;
        int comparedPrice = 0;

        price = pricePerSquare * pricePerSquare;
        comparedPrice = compared.pricePerSquare * compared.pricePerSquare;

        if (price > comparedPrice) {
            isMoreExpensive = true;
        }

        return isMoreExpensive;
    }
}
