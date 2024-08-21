public class printpattern2 {
    // Question 1: Butterfly pattern
//     public static void butterfly(int n){
//         // 1st half
//         for(int i=1; i<=n; i++){
//             //stars -i
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");

//             }
//             //space -2*(n-i)
//             for(int j=1; j<=2*(n-i); j++){
//                 System.out.print(" ");
//             }
             
//             //stars -i
//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //2nd half
//         for(int i=n; i>=1;i--){
//             //stars -i
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");

//             }
//             //space -2*(n-i)
//             for(int j=1; j<=2*(n-i); j++){
//                 System.out.print(" ");
//             }
             
//             //stars -i
//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//         }
//         System.out.println();
//     }
    
// }
// public static void main(String[] args) {
//     butterfly(5);

// Question 2: Hollow Rectangle
public static void Hollow_rectangle(int totRows, int totCols){
    //outer loop
    for(int i=1; i<=totRows; i++){
        // inner - columns
        for(int j=1; j<=totCols; j++){
            //cell - (i,j)
            if(i == 1 || i == totRows || j == 1 || j == totCols){
                //boundary cells
                System.out.print("*");

            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    Hollow_rectangle(6, 7);
}
}

