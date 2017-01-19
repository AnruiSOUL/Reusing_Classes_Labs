package ReusingClassesLabs;

/**
 * Created by randallcrame on 1/19/17.
 */
public class CheckingAccount extends Account{

    CheckingAccount(String accountNumber, String accountHoldersName, double balance){
        setAccountNumber(accountNumber);
        setAccountHoldersName(accountHoldersName);
        setAccountBalance(balance);
        setAccountType("Checking");
    }

    protected void debitTransaction(double input){
       if (input> 0)
            accountBalance -= input;
    }

    protected void creditTransaction(double input){
        if (input>0)
            accountBalance += input;
    }
}
