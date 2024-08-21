public class printpattern {
    // Question 1: print star pattern
    // public static void main(String[] args) {
    //     for(int line=1; line<=4; line++){
    //         // one line
    //         for(int star=1; star<=line; star++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

   // Question 2: print inverted-star pattern

//    public static void main(String[] args) {
//     int n =4;
//     for(int i = 1; i<=4; i++){
//         // one lin
//         for(int s=1; s<=n-i+1;s++){
//   System.out.print("*");
//         }
//         System.out.println();
//     }

  // Question 3: print half-pyramid pattern
     
    // public static void main(String[] args) {
    //     int n = 4;
    //     for(int line=1; line<=4; line++){
    //         for(int number = 1; number<=line; number++){
    //             System.out.print(number + " ");
    //         }
    //         System.out.println();
    //     }

      // Question 4: print character pattern;
      public static void main(String[] args) {
        int  n = 5;
        char ch = 'A';
        //outer loop
        for(int line = 1; line <= n; line++){
      //Inner loop
      for(int chars = 1; chars<=line; chars++){
        System.out.print(ch);
        ch++;
      }
      System.out.println();

        }
      }
    
   }


