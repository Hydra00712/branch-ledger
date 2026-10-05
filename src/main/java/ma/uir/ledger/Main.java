package ma.uir.ledger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account account1 = Account.createAccount("standard","Adam",20000);
        Account account2 = Account.createAccount("business","Mohamed",15000);
        Account account3 = Account.createAccount("Premium","Rachid",100000);

        /*
        Account account4 = Account.createAccount("vip","Yassir",1000);
         */

        System.out.println(account1.monthlyFee());
        System.out.println(account2.monthlyFee());
        System.out.println(account3.monthlyFee());
        System.out.println(Account.INTEREST_RATE);
    }

}