package sections.sec99_algorithms_livecoding_practice.oop_scenarios.Encapsulation_Validation_ThreadSafety;

/*
    BankAccount class’ı: deposit, withdraw, getBalance.
    Negatif deposit olmasın, bakiye yetersizse withdraw exception atsın.
    Thread-safety sorabilirler (bonus)

    Follow-up soruları:
    Soru: “BigDecimal neden?
    Cevap: money için double/float kullanılmaz.

    Soru: synchronized yerine ne kullanılabilir?
    Cevap: ReentrantLock, ya da higher-level transaction yaklaşımı
*/

import java.math.BigDecimal;

public class BankAccountWithValidation {
    static class InsufficientBalanceException extends RuntimeException {
        InsufficientBalanceException(String message) {
            super(message);
        }
    }

    static class BankAccount {
        private final String accountNo;
        private BigDecimal balance;

        BankAccount(String accountNo) {
            this.accountNo = accountNo;
            this.balance = BigDecimal.ZERO;
        }

        // Basit senaryoda synchronized ile thread-safety sağlanabilir
        synchronized void deposit(BigDecimal amount) {
            validateAmount(amount);
            balance = balance.add(amount);
        }

        synchronized void withdraw(BigDecimal amount) {
            validateAmount(amount);

            if (balance.compareTo(amount) < 0) {
                throw new InsufficientBalanceException(
                        "Insufficient Balance! Balance: " + balance + ", withdraw: " + amount
                );
            }

            balance = balance.subtract(amount);
        }

        synchronized BigDecimal getBalance() {
            return balance;
        }

        String getAccountNo() {
            return accountNo;
        }

        private void validateAmount(BigDecimal amount) {
            if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("TR123");
        account.deposit(new BigDecimal("100.00"));
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(new BigDecimal("40.00"));
        System.out.println("Balance: " + account.getBalance());
    }
}
