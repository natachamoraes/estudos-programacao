package Exercício;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int A, B, soma;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        soma = A + B;

        System.out.println("soma = " + soma);

    }
}
