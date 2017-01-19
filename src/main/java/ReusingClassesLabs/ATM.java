package ReusingClassesLabs;

import java.util.ArrayList;

/**
 * Created by randallcrame on 1/19/17.
 */
public class ATM {

    ArrayList<String > transactionHistory = new ArrayList<>();

    public void addDebitTransaction(Account account, double amount){
        account.debitTransaction(amount);
        String transactionRecord = amount + " was debited from " + account.getAccountNumber();
        transactionHistory.add(transactionRecord);
    }

    public void addCreditTransaction(Account account, double amount){
        account.creditTransaction(amount);
        String transactionRecord = amount + " was credited from " + account.getAccountNumber();
        transactionHistory.add(transactionRecord);
    }

    public void deleteTransaction(int input){
        transactionHistory.remove(input);
        }

}
