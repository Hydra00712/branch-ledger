package ma.uir.ledger;

import java.util.HashSet;
import java.util.Locale;

import static ma.uir.ledger.Account.createAccount;


public class Main {
    public static void main(String[] args) {

        Account adam1 = Account.createAccount("standard","Adam",1000);
        Account adam2 = Account.createAccount("PREMIUM","Adam",2000);

        System.out.println(adam1==adam2);
        System.out.println(adam1.equals(adam2));

        HashSet<Account> clients = new HashSet<>();
        clients.add(adam1);
        clients.add(adam2);
        System.out.println(clients.size());

        Account b = adam1;
        b.deposit(100);
        System.out.println(adam1);

    }

}