package ma.uir.ledger;

public class StandardAccount extends Account {

    private static final double MONTHLY_FEE = 10.0;

    public StandardAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public double monthlyFee() {
        return MONTHLY_FEE;
    }

    @Override
    public String typeName() {
        return "Standard";
    }
}
