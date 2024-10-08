public class Account {
    String accountName;
    int accountNumber;
    double balance;

    public Account(String accountName, int accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        if (amount > 200000) {
            System.out.println("You can't deposit more than 200000");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful" + amount + " has been withdrawn" + "here is your balance" + balance);
        }
    }
}
