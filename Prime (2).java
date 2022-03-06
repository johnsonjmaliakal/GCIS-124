public class Prime {

   /*
   Write a function that returns a true 
   if a given input integer is a prime number
   Otherwise, the function returns false
   */ 

    public static boolean isPrime(int x){
        int N = (int)Math.sqrt(x);
        for(int i=2; i<=N; i++)
           if(x % i == 0)
              return false;
        return true;      
    }
    
}
