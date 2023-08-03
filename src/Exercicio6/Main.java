package Exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        double Triagulo;
        double ValorPi = 3.14159;
        double Circulo;
        double Trapezio;
        double Quadrado;
        double Retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        Triagulo = A * C / 2;
        Circulo = ValorPi * Math.pow(C, 2);
        Trapezio = (A + B) * C;
        Quadrado = Math.pow(B, 2);
        Retangulo = A * B;

        System.out.printf("Triangulo: %.3f%n", Triagulo);
        System.out.printf("Circulo: %.3f%n", Circulo);
        System.out.printf("Trapezio: %.3f%n", Trapezio);
        System.out.printf("Quadrado: %.3f%n", Quadrado);
        System.out.printf("Retangulo: %.3f%n", Retangulo);
                    sc.close();
    }
}
