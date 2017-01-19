package ReusingClassesLabs;

/**
 * Created by randallcrame on 1/19/17.
 */
public class BusinessAccount extends Account{

    BusinessAccount(String accountNumber, String accountHoldersName, double balance){
        setAccountNumber(accountNumber);
        setAccountHoldersName(accountHoldersName);
        setAccountBalance(balance);
        setAccountType("Business");
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
