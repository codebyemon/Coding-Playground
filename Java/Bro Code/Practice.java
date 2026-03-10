public class Practice {
     public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("8273747","emon",3839);
        b1.deposit(1000);
        b1.withdraw(500);
        b2.deposit(1000);
        b2.withdraw(1000);
        b1.getAccountDetails();
        b2.getAccountDetails();
        System.out.println(BankAccount.totalAccounts);
        System.out.println(b1.getTotalaccounts());
    }
}
class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    static int totalAccounts=0;
    BankAccount(){
        this("000000","Unknown",0.0);
    }
    BankAccount(String accountNumber,String accountHolderName,double balance){
        this.accountNumber= accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        totalAccounts++;
    }
    void deposit(double amount){
        balance +=amount;
        System.out.println(balance);
    }
    void withdraw(double amount){
        if(balance<amount){
            System.out.println("does not have enough balance to withdraw");
        }
        balance-=amount;
    }
    void getAccountDetails(){
        System.out.println(accountNumber+accountHolderName+balance);
    }
    int getTotalaccounts(){
        return totalAccounts;
    }
}