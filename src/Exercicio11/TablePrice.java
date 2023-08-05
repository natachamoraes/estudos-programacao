package Exercicio11;

public class TablePrice { //ENTIDADE

    int id; //campos da entidade

    String name;

    double price;

    public TablePrice(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public static TablePrice[] CreateTablePrice() {
        TablePrice[] lineTable = new TablePrice[5];
        lineTable[0] = new TablePrice(1,"Cachorro Quente", 4.00);
        lineTable[1] = new TablePrice(2, "X-Salada", 4.50);
        lineTable[2] = new TablePrice(3, "X-Bacon", 5.00);
        lineTable[3] = new TablePrice(4, "Torrada simples", 2.00);
        lineTable[4] = new TablePrice(5, "Refrigerante", 1.50);

        return lineTable;
    }
}
