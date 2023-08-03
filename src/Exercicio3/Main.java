package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        int Result;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        Result = (A * B - C * D);

        System.out.println("Diferença = " + Result);


          sc.close();
    }
}
