import java.util.Scanner;

public class ActionsWithAccount {

    static int quantityOfWithdrawals = 0;
    static int quantityOfDeposits = 0;
    static int[] withdrawalHistory = new int[1000];
    static int[] depositHistory = new int[1000];

    //makes deposit
    public static void makeDeposit(BankAccount account,int amount){
        account.balance += amount;
        depositHistory[quantityOfDeposits] = amount;
        quantityOfDeposits++;
        System.out.println(amount+" was successfully deposited to your account\n");
    }

    //withdraw from entered account
    public static void withdraw(BankAccount account, int amount){
        if(account.balance > amount){
            account.balance -= amount;
            withdrawalHistory[quantityOfWithdrawals] = amount;
            quantityOfWithdrawals++;
            System.out.println(amount+" was successfully withdrew from your account!\n");
        }
        else{
            System.out.println("Insufficient funds!\n");
        }
    }

    //displays withdrawal history
    public static void withdrawalHistory(){
        if (quantityOfWithdrawals<=1000){
            System.out.println("Your withdrawal history is: \n");
            for(int i = 0; i<quantityOfWithdrawals; i++){
                System.out.println(withdrawalHistory[i]);
            }
        }
        else{
            System.out.println("Withdrawal history is full!\n");;
        }
    }

    //displays deposit history
    public static void depositHistory(){
        if (quantityOfDeposits<=1000){
            System.out.println("Your deposit history is: \n");
            for(int i = 0; i<quantityOfDeposits; i++){
                System.out.println(depositHistory[i]);
            }
        }
        else{
            System.out.println("Withdrawal history is full!\n");;
        }
    }

    //transfers money from A to B
    public static void transferMoney(BankAccount myAccount, BankAccount recipient, int amount){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the id of your account to accept the transfer: ");
        int id = scan.nextInt();
        if(id == myAccount.accountId) {
            if (myAccount.balance > amount) {
                myAccount.balance -= amount;
                recipient.balance += amount;
                quantityOfWithdrawals++;
            } else {
                System.out.println("Error! Insufficient funds!");
            }
        }
        else{
            System.out.println("Incorrect id!");
        }
    }
}
