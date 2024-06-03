package patterns;

//Pattern type:
//____*____
//___***___
//__*****__
//_*******_
//*********

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i; j++) System.out.print(" ");
            for(int j=0; j<i; j++) System.out.print("*");
            for(int j=1; j<i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
