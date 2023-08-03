package Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double NúmeroDoFuncionário, HorasTrabalhadas, ValorPorhora;
        double SalárioDoFuncionário;

        NúmeroDoFuncionário = sc.nextDouble();
        HorasTrabalhadas = sc.nextDouble();
        ValorPorhora = sc.nextDouble();
        SalárioDoFuncionário = HorasTrabalhadas * ValorPorhora;

        System.out.printf("Number = %.0f%n", NúmeroDoFuncionário);
        System.out.printf("salary = U$ %.2f", SalárioDoFuncionário);

                sc.close();
    }
}
