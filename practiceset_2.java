
//import com.sun.tools.javac.Main;
import java.util.Scanner;  
//conditional statement Question.
//Question 1. write a java program to get A number from user and print wheather it is positive or negative
public class practiceset_2 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int x = sc.nextInt();
    //     if(x>34){
    //         System.out.println("x is grater then 0");

    //     } else{
    //         System.out.println("x is less then 0");
    //     }

      // Question 2: finish the following code so that it prints you have a feaver 
      // if your temperature is above 100 and otherwise prints you dont't have a feaver

    //   public static void main(String[] args) {
    //     double temp = 103.5;
    //     if(temp > 110){
    //         System.out.println("you have a feaver");

    //     }else{
    //         System.out.println("you don't have afeaver");
       
            // Question 3: write a java program to input week number(1-7) and print day of a week name using switch case.
              
           // import java.util.Scanner;    
            // public static void main(String[] args) {
            //     Scanner sc=new Scanner(System.in);
            //  int week = sc.nextInt();
            //  switch(week){
            //     case 1:
            //     System.out.println("Monday");
            //      break;
            //      case 2:
            //      System.out.println("Tuesday");
            //      break;
            //      case 3:
            //      System.out.println("Wednesday");
            //      break;
            //      case 4:
            //      System.out.println("Thrusday");
            //      break;
            //      case 5:
            //      System.out.println("Friday");
            //      break;
            //      case 6:
            //      System.out.println("saturday");
            //      break;
            //      case 7:
            //      System.out.println("Sunday");
            //      break;
            //      default:
            //      System.out.println("Invalid input! please inter week number between (1-7)");
            //  }



               // Question 4: write a java program that takes a year from the used and print wheather that year is a leap or not

                          public static void main(String[] args) {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Input the year :");
                            int year = sc . nextInt();
                            boolean x = (year % 4) ==0;
                            boolean y = (year % 100)!= 0;
                            boolean z = (year % 100 ==0) && (year % 400 == 0);
                             if(x && (y || z)){
                                System.out.println(year + "is a leap year");
                             }else{
                                System.out.println(year + " is not a leap year");
                             }
                             }

                          }

            
      
    
    

