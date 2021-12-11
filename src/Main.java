public class Main extends BankAccount{
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Ilia", 10020310, 1019);
        BankAccount KostyaAccount = new BankAccount("Kostya", 23014095, 0);

        transferMoney(myAccount,KostyaAccount,519);

        System.out.println(myAccount.balance+"\n");

        System.out.println(KostyaAccount.balance+"\n");
    }
}
