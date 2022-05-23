package Bank;

public class BankAccount {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public BankAccount(int balance) {
        this.balance = this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount) {
        if(balance>=amount) {
            balance -= amount;
            return true;
        }

        return false;
    }

    // 입금

    public boolean deposit(int amount) {
        balance += amount;
        return true;
    }
}
