package ma.uir.ledger;

import java.util.Locale;

import static ma.uir.ledger.Account.createAccount;


public class Main {
    public static void main(String[] args) {

        Account[] clients = {
                createAccount("standard", "Adam", 1000),
                createAccount("premium", "Sara", 2500),
                createAccount("standard", "Omar", 300),
                createAccount("business", "Lina", 4200),
                createAccount("premium", "Youssef", 750)
        };

        for (int i = 0; i < clients.length; i++) {
            System.out.printf(Locale.ROOT, "Account %d  - %s: %.0f MAD- %s, %.0fMAD/month, %s", i + 1, clients[i].getName(), clients[i].getBalance(), clients[i].typeName(), clients[i].monthlyFee(), clients[i].isVip() ? "VIP" : "Regular");
            System.out.println();
        }

        try {
            System.out.println("New balance: "+clients[0].deposit(500));
        } catch (IllegalArgumentException e) {
            System.out.println("Refused "+e.getMessage());
        } finally {
            System.out.println("Transaction complete");
        }

        try {
            System.out.println("New balance: "+clients[0].withdraw(200));
        } catch (IllegalArgumentException e) {
            System.out.println("Refused "+e.getMessage());
        } finally {
            System.out.println("Transaction complete");
        }


        try {
            System.out.println("New balance: "+clients[0].deposit(-100));
        } catch (IllegalArgumentException e) {
            System.out.println("Refused "+e.getMessage());
            System.out.println("Balance unchanged: " + clients[0].getBalance());
        } finally {
            System.out.println("Transaction complete");
        }

        try {
            System.out.println("New balance: "+clients[0].withdraw(2000));
        } catch (IllegalArgumentException e) {
            System.out.println("Refused "+e.getMessage());
            System.out.println("Balance unchanged: " + clients[0].getBalance());
        } finally {
            System.out.println("Transaction complete");
        }


    }

}