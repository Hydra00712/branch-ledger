package ma.uir.ledger;

public abstract class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public abstract double monthlyFee();

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f MAD", name, balance);
    }
}
