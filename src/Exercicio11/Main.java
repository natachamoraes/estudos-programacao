package Exercicio11;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static TablePrice procuraIdNaTabelaDePreco(TablePrice[] table, int index){
        for (TablePrice tablePrices : table){
            if(tablePrices.id == index){
               return tablePrices;
            }
        }
        return null;
    }
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        TablePrice[] table = TablePrice.CreateTablePrice();

        TablePrice tablePrice = procuraIdNaTabelaDePreco(table, codigo);

        if (tablePrice != null) {
            double result = tablePrice.price * quantidade;
            System.out.printf("Total: R$ %.2f", result);
        } else {
            System.out.println("Código não encontrado na tabela de preços.");
        }

        sc.close();
    }
}
