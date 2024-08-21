 
 // Question 1. Average of 3 number
 import java.util.Scanner;
public class practiceset_1 {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int c = sc.nextInt();
//     int avg = (a+b+c)/3;
//     System.out.println("average is:"+avg);
  
     //Question 2.Area of Square?

    //   public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int side = sc.nextInt();
    //     int area = side*side;
    //     System.out.println("area of square is:"+area);


    // Question 3. Bill of Item.
      
    //public class Solution {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);
        //Add on - with 18% tax
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : " + newTotal);
        }
    }
