import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         int num1, num2;
         try{
            System.out.println("Enter the first integer");
            num1 = scan.nextInt();
            System.out.println("Enter the second integer");
            num2 = scan.nextInt();
            System.out.println("result of add is " + add(num1,num2)); 
            System.out.println("result of sub is " + sub(num1,num2));   
            System.out.println("result of mul is " + mul(num1,num2));   
            System.out.println("result of div is " + div(num1,num2)); 
         }
         catch(InputMismatchException e){
             System.out.println("you did not enter an integer");
             System.exit(0);
         }
         scan.close(); 
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    
}
