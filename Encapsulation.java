import java.util.*;

class Account {

    private String AccountHolder;
    private double Balance;

    public void setAccountHolder(String name) {
        AccountHolder = name;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    private void AddAmount(double Amount) {

        Balance = Balance + Amount;

    }

    public void Deposit(double Amount) {
        if (Amount > 0) {
            AddAmount(Amount);
        }
    }

    public void Withdrawal(double Amount) {
        if (Amount <= Balance) {
            Balance = Balance - Amount;
        }

    }

    public double getBalance() {
        return Balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Account a1 = new Account();
        a1.setAccountHolder("Shruti");
        a1.Deposit(100000);
        a1.Withdrawal(5000);

        System.out.println(a1.getAccountHolder());
        System.out.println(a1.getBalance());

        Account a2 = new Account();
        a2.setAccountHolder("Shreya");
        a2.Deposit(200000);
        a2.Withdrawal(10000);

        System.out.println(a2.getAccountHolder());
        System.out.println(a2.getBalance());
    }
}