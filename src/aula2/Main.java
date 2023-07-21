package aula2;

public class Main {
    public static void main(String[] args) {
        String product1 = "computer";
        String product2 = "office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        System.out.printf("Products: %n");
        System.out.printf("Commputer, which price is $ %.2f%n", price1);
        System.out.printf("Office desk, which price is $ %.2f%n%n", price2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
        System.out.printf("Meause whith eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (tree decimmal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
