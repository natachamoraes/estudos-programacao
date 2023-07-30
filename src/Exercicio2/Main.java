package Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double A;
        double valorPi =  3.14159;
        double valorPotencia;
        double valorFinal;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();

        valorPotencia = Math.pow(A, 2);
        valorFinal = valorPi * valorPotencia;

        System.out.printf("A=%.4f", valorFinal);


    }
}
