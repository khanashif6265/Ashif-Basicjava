import java.util.*;
public class printallprimesinarange {
   public static void primesInRange(int n){
    for(int i=2; i<=n; i++){
        if(isprime(i)) {
   System.out.println(i+" ");

        }
    }
    System.out.println();
}
public static void main(String[] args) {
    primesInRange(10);
}
}