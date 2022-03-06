public class Prime {


    public static void main(String[] args) {
        int x = 37;
        System.out.println(isPrime(x));   
    }

    public static boolean isPrime (int n) {
        for (int i=2; i<=n-1; i++) {
            if (n % i == 0) 
                return false;
        }
        return true;
    }
}