import java.util.*;
public class practiceset_3 {
    //loop Question
    // Quetion 1: Write a program that reads a set of integer and 
    //and then prints the sum of the even and odd integers.
    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int number;
    //     int choice;
    //     int evenSum = 0;
    //     int oddSum = 0;
    //      do { 
    //          System.out.println("Enter the number");
    //         number = sc.nextInt();
    //         if(number % 2 == 0){
    //             evenSum += number;

    //         }else{
    //             oddSum += number;

    //         }
    //         System.out.println("Do you want to continue? press 1 for yes or 0 for no");
    //         choice = sc.nextInt();


    //         } while(choice==1);
    //         System.out.println("Sum of even numbers:  " + evenSum);
    //         System.out.println("Sum of odd numbers:" + oddSum);
      
     //Question 2: write a program to find the factorial of any number entered by the user
       
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("Enter any positive integer: ");
        num = sc . nextInt();
        for(int i=1; i<=num; i++){
            fact *= i;

        }
        System.out.println("Factorial:" + fact);

     // Question 3: write a program to print the multiplication table of a number N,entered by the user;

       
       
      }

     }
    


