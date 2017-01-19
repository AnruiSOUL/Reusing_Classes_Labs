package ReusingClassesLabs;

/**
 * Created by randallcrame on 1/19/17.
 */
public class SavingsAccount extends Account{

    SavingsAccount(String accountNumber, String accountHoldersName, double balance){
        setAccountNumber(accountNumber);
        setAccountHoldersName(accountHoldersName);
        setAccountBalance(balance);
        setAccountType("Savings");
    }

    public void debitTransaction(double input){
       if (input> 0)
            accountBalance -= input;
    }

    public void creditTransaction(double input){
        if (input>0)
            accountBalance += input;
    }
}
