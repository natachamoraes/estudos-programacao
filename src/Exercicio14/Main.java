package Exercicio14;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorSalario = sc.nextDouble();
        double imposto;


        if (valorSalario <= 2000.00){
            imposto = 0.0;
        } else if (valorSalario <= 3000.00) {
            imposto = (valorSalario - 2000) * 0.08;
        } else if (valorSalario <= 4500.00) {
            imposto = (valorSalario - 3000) * 0.18 + 1000 * 0.08;
        } else {
            imposto = (valorSalario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if (imposto == 0.0){
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto );
        }

        sc.close();
    }
}
