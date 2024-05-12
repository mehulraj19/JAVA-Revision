package patterns;

//pattern type:
//
//*****
//-****
//--***
//---**
//----*

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int k=0;
        for(int i=n; i>0; i--) {
            for(int j=0; j<k; j++) System.out.print(" ");
            for(int j=0; j<i; j++) System.out.print("*");
            k++;
            System.out.println();
        }
    }
}
