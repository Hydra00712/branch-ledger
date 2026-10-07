package ma.uir.ledger;

import java.util.Locale;
import static ma.uir.ledger.Account.createAccount;


public class Main {
    public static void main(String[] args) {

        Account[] clients = {
                createAccount("standard","Adam",1000),
                createAccount("premium","Sara",2500),
                createAccount("standard","Omar",300),
                createAccount("business","Lina",4200),
                createAccount("premium","Youssef",750)
        };

        for(int i=0;i < clients.length;i++){
            System.out.printf(Locale.ROOT,"Account %d  - %s: %.0f MAD- %s, %.0fMAD/month, %s",i+1,clients[i].getName(),clients[i].getBalance(),clients[i].typeName(),clients[i].monthlyFee(),clients[i].isVip() ? "VIP":"Regular");
            System.out.println();
        }

        /*
        Account account1 = createAccount("standard","Adam",20000);
        Account account2 = createAccount("business","Mohamed",15000);
        Account account3 = createAccount("Premium","Rachid",100000);


        Account account4 = Account.createAccount("vip","Yassir",1000);
         */


    }

}