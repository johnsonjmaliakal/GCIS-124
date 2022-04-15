public class Collatz {
    
    /*
    Write a function that determines Collatz sequence
    Use the following formula to determine the next value in the sequence:
    C(n) = n / 2 (if n is even)
    C(n) = 3n + 1 (if n is odd)

    For example, if n=5, 
    the Collatz Sequence ending at 1 would be: 5 16 8 4 2 1
    */

    public static String sequence(int n){
        String str = ""; 
        while(n!=1){
            str = str + n + " ";
            if(n%2==0) { //if n is even
                n = n/2;
            }
            else{ // n is odd
                n = 3 * n + 1;
            }
        }
        str = str + "1";
        return str;
    }

}
