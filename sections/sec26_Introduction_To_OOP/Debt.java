package sections.sec26_Introduction_To_OOP;

public class Debt {
    private float balance;
    private float interestRate;

    public Debt(float balance, float interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void printBalance() {
        System.out.println("Balance: " + this.balance);
    }

    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
    }
}
