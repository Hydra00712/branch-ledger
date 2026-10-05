package ma.uir.ledger;

public class BusinessAccount extends Account {

    private static final double MONTHLY_FEE = 50.0;


    public BusinessAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public double monthlyFee() {
        return MONTHLY_FEE;
    }
}
