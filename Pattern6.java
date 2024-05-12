package patterns;


//pattern type:
//
//___*
//__***
//_*****
//*******
//_*****
//__***
//___*

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int k = n;
        for(int i=0; i<n; i++){
            k--;
            for(int j=0; j<k; j++) System.out.print(" ");
            for(int j=0; j<n-k; j++) System.out.print("*");
            for(int j=1; j<n-k; j++) System.out.print("*");
            System.out.println();
        }
        k = 0;
        for(int i=0; i<n; i++) {
            k++;
            for(int j=0; j<k; j++) System.out.print(" ");
            for(int j=0; j<n-k; j++) System.out.print("*");
            for(int j=1; j<n-k; j++) System.out.print("*");
            if(n-k > 0) System.out.println();
        }

    }
}
