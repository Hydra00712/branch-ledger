package ma.uir.ledger;

import java.util.Locale;

public abstract class Account {
    private String name;
    private double balance;

    public static final double INTEREST_RATE = 0.03;

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
        return String.format(Locale.ROOT, "%s: %.2f MAD", name, balance);
    }

    public static Account createAccount(String accountType, String name, double balance) {
        return switch (accountType.toUpperCase()) {
            case "STANDARD" -> new StandardAccount(name, balance);
            case "PREMIUM" -> new PremiumAccount(name, balance);
            case "BUSINESS" -> new BusinessAccount(name, balance);
            default -> throw new IllegalArgumentException("Invalid account type");
        };
    }
}
