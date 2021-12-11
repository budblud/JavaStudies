public class BankAccount extends ActionsWithAccount {
     String name;
     int accountId;
     int balance;

    public BankAccount(){

    }
    // implemented overloaded constructor
    public BankAccount(String name, int accountId, int balance){
        this();
        setName(name);
        setAccountId(accountId);
        setBalance(balance);
    }

    //setters are created to set name, accountId and balance
    public void setName(String name){
        this.name = name;
    }
    public void setAccountId(int accountId){
        this.accountId = accountId;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
