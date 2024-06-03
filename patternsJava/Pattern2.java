package patterns;

//Pattern type:
//*****
//****
//***
//**
//*

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for(int i=n; i>0; i--) {
            for(int j=i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
