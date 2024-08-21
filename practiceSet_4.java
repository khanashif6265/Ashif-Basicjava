 // Function Question
 // Question 1: write a java method to comput the average of three numbers. 

 import java.util.Scanner;
public class practiceSet_4 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Input the first number: ");
    //     double x = sc.nextDouble();
    //     System.out.print("Input the second number:");
    //     double y = sc.nextDouble();
    //     System.out.print("Input the three number:");
    //     double z = sc.nextDouble();
    //     System.out.println("The average value is" + average(x,y,z)+"\n");

    // }
    // public static double average(double x, double y,double z){
    //     return (x+y+z) /3;

       // Question 2: write a method named is even that accepts an int argument the method should return true
       //if the arguments is even or false other wise also write a program to test your method

    //    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num;
    //     System.out.println("Enter an integer:");
    //     num = sc.nextInt();
    //     if(num%2==0){

        
    //     System.out.println("even");;


    //    }else{
    //     System.out.println("odd");
    //    }
    // }

    // Question 3: write a java program to check if a number is a palindrome in java?(121 is a palindrome)
    //(321 is not palindrome)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if(ispalindrome(palindrome)){
            System.out.println("palindrome");


        }else{
            System.out.println("not palindrome");

        }
    }
public static boolean ispalindrome(int number){
    int palindrome = number;
    int reverse = 0 ;
while (palindrome !=0){
    int remainder = palindrome % 10;
    reverse = reverse * 10 + remainder;
    palindrome = palindrome /10;
}
if(number == reverse){
    return true;
}
return false;
}
}