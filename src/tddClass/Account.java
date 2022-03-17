package tddClass;

public class Account {

    private int balance;


    public void deposit(int amount) {
        if(amount < 0)
            balance = balance;
    }

    public void withdrawal(int amount) {
        if(balance> amount)
            balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}