import java.util.*;
public class multiplicationtable {
    // Question 3: write a program to print the multiplication table of a number N,entered by the user;
  public static void printmultiplicationtable(int number){
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 for(int i=1;i<=10;i++){
    System.out.println(n + " + " + i + "=" + n*i);

 }
  }
  public static void main(String[] args) {
    printmultiplicationtable(4);
  }
}
