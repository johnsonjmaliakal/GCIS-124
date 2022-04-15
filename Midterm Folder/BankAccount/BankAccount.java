package BankAccount;

public class BankAccount implements Comparable<BankAccount> {
    private final String name;
    private double balance;
    
    public BankAccount(String name){
        this.name = name;
        balance = 0;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    @Override
    public int compareTo(BankAccount o) {
        // to be completed by the student
        double difference = balance - o.balance;
        if (difference < 0){
            return -1;
        }
        if (difference > 0){
            return 1;
        }
        return 0;
    }

    public static boolean wireTransfer(BankAccount from, BankAccount to, double amount){
        // to be completed by the student
        if (from.balance >= amount){
            return true;
        }
        return false;
    } 
}
