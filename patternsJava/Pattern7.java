package patterns;

import java.util.Scanner;

//pattern type:
//        *
//       **
//      ***
//     ****
//    *****
public class Pattern7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int k = n;
        for(int i=0; i<n; i++){
            k--;
            for(int j=0; j<k; j++) System.out.print(" ");
            for(int j=0; j<n-k; j++) System.out.print("*");
            System.out.println();
        }

    }
}
