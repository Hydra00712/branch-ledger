package ma.uir.ledger;

public class PremiumAccount extends Account {

    public static final double MONTHLY_FEE = 25.0;

    public PremiumAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public double monthlyFee() {
        return MONTHLY_FEE;
    }

    @Override
    public String typeName() {
        return "Premium";
    }

}
