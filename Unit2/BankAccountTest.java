
import java.util.Scanner;
public class BankAccountTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer1 name");
        String name1 = sc.next();
        BankAccount account1 = new BankAccount(name1);
        System.out.println("Enter customer2 name");
        String name2 = sc.next();
        BankAccount account2 = new BankAccount(name2);
        System.out.println("number of accounts is " + BankAccount.getNumOfAccounts());
        sc.close();
    }
}

