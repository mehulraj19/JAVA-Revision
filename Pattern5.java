package patterns;

//pattern type:
//
//*****
//_***_
//__*__

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int k=0;
        for(int i=n; i>0; i--) {
            for(int j=0; j<k; j++) System.out.print(" ");
            for(int j=0; j<n-k*2; j++) System.out.print("*");
            k++;
            if(n - 2*k > 0) System.out.println();
        }
    }
}
