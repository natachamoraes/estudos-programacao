package Exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x;

        x = sc.nextInt();
        if (x < 0) {
            System.out.println("negativo");
        }
        else {
            System.out.println("positivo");
        }

        sc.close();
    }
}
