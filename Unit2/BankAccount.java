
public class BankAccount {
    private final String owner;
    private int balance;
    private static int count = 0;

    public BankAccount(String name){
        owner = name;
        balance = 0;
        count++;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }
    public int getBalance(){
        return balance;
    }
    public String getOwner() {
        return owner;
    }
    public static int getNumOfAccounts(){
        return count;
    }
}



