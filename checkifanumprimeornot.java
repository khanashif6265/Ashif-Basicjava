



public class checkifanumprimeornot {
    public static boolean isPrime(int n){
        boolean  isPrime = true;
        for(int i = 2; i<=n-1;i++){
            if(n % i == 0){ // completly dividing
                isPrime = false;
                break;



            }
        }
        return isPrime;
        
    }
    public static void main(String[] args) {
        System.out.println(isPrime(14));
    }
        
}
      // Question : print All primes in arange

       