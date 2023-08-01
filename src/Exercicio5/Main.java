package Exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double CodigoDaPeça1, NúmeroDePeças1, ValorDeCadaPeça1;
        double  CodigoDaPeça2, NúmeroDePeças2, ValorDeCadaPeça2;
        double ValorASerPago;

        CodigoDaPeça1 = sc.nextDouble();
        NúmeroDePeças1 = sc.nextDouble();
        ValorDeCadaPeça1 = sc.nextDouble();

        CodigoDaPeça2 = sc.nextDouble();
        NúmeroDePeças2 = sc.nextDouble();
        ValorDeCadaPeça2 = sc.nextDouble();

        ValorASerPago = NúmeroDePeças1 * ValorDeCadaPeça1  + NúmeroDePeças2 * ValorDeCadaPeça2;
        System.out.printf("VALOR A PAGAR R$ %.2f%n", ValorASerPago);

        sc.close();
    }
}
