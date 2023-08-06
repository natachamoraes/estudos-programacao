package Exercicio13;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        } else if (x == 0.0){
            System.out.println("Eixo y");
        } else if (y == 0.0){
            System.out.println("Eixo x");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Quadrante 1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Quadrante 2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Quadrante 3");
        } else if (x > 0.0 && y <0.0){
            System.out.println("Quadrante 4");
        }
    }
}
