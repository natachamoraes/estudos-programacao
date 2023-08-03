package Exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        boolean isMultply = A > B ? A % B == 0 : B % A == 0;

        if (isMultply){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao Sao Multiplos");
        }
    }
}
