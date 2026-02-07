package sections.sec26_Introduction_To_OOP;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        while (this.balance >= 2.60) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        while (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            this.balance += 0;
        }
        else if (balance > 0 && this.balance + balance < 150) {
            this.balance = this.balance + balance;
        } else {
            this.balance = 150;
        }
    }

    public String toString() {
        return "Card has a balance of " + this.balance + " euros";
    }
}


/*
    PART 1: Class Template
    First, create the PaymentCard object's constructor, which is passed the opening balance of the card, and which then stores that balance in the object's internal variable.
    Then, write the toString method, which will return the card's balance in the form "The card has a balance of X euros".


    PART 2: Making Transactions
    The method "eatAffordably" should reduce the card's balance by € 2.60
    The method "eatHeartily" should reduce the card's balance by € 4.60.


    PART 3: Non-Negative Balance
    Change the methods eatAffordably and eatHeartily so that they don't reduce the balance should it turn negative.


    PART 4: Add Money
    Create "setBalance" method to increase the balance of the account.
    However, the card's balance may not exceed 150 euros. As such, if the amount to be topped up exceeds this limit, the balance should, in any case, become exactly 150 euros.


    PART 5: Negative Value Not Allowed
    so that if there is an attempt to top it up with a negative amount, the value on the card will not change.
*/
