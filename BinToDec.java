public class BinToDec {
    // public static void bintodec(int binNum){
    //     int myNum = binNum;
    //     int pow = 0;
    //     int decNum = 0;

    //     while(binNum > 0){
    //         int lastDigit = binNum % 10;
    //         decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
    //         pow++;
    //         binNum = binNum/10;


    //     }
    //     System.out.println("decimal of" + myNum +" =" + decNum);

    // }
    // public static void main(String[] args) {
    //     bintodec(403);


       // Question 2: This code of binary to Decimal
       public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
         
        while(n > 0){
            int rem = n %2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
         System.out.println("binnary form of" + myNum + " = "+ binNum);

       }
       public static void main(String[] args) {
        decToBin(5);
       }
    }
    
    

