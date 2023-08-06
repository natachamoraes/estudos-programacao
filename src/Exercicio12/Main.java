package Exercicio12;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double Valor = sc.nextDouble();


        if (Valor < 0.0 || Valor > 100.0) {
            System.out.println("fora do intervalo");
        }
        else if(Valor <= 25.5){
            System.out.println("intervalo [0,25]");
        }
        else if (Valor <= 50.0){
            System.out.println("intervalo [25.50]");
        }
        else if (Valor <= 75.0){
            System.out.println("intervalo [50.75]");
        }
        else {
            System.out.println("intervalo [75.100]");
        }

        sc.close();
    }
}
