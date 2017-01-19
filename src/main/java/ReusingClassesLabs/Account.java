package ReusingClassesLabs;


/**
 * Created by randallcrame on 1/19/17.
 */
 abstract class Account {
    protected String accountType;
    protected String accountNumber;
    protected double accountBalance;
    protected String accountHoldersName;

    void setAccountType(String input){
        this.accountType = input;
    }

    public String getAccountType() {
        return this.accountType;
    }

    protected String  setAccountNumber(String accountNumber) {this.accountNumber = accountNumber}
    }
    public String  getAccountNumber() {
        return this.accountNumber;
    }

    void setAccountBalance(double input){
            this.accountBalance = input;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public void setAccountHoldersName(String input) {
            this.accountHoldersName = input;
    }

    public String getAccountHoldersName() {
        return this.accountHoldersName;
    }


    abstract void debitTransaction(double input);

    abstract void creditTransaction(double input);

}
