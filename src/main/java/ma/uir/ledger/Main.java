package ma.uir.ledger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account account1 = new StandardAccount("Adam",20000);
        Account account2 = new PremiumAccount("Mohamed",15000);
        Account account3 = new BusinessAccount("Rachid",100000);
        System.out.println(account1);

        System.out.println(account1.monthlyFee());
        System.out.println(account2.monthlyFee());
        System.out.println(account3.monthlyFee());
        System.out.println(Account.INTEREST_RATE);
    }
}