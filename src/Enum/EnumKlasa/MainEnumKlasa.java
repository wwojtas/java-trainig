package Enum.EnumKlasa;

public class MainEnumKlasa {
    public static void main(String[] args) {
        Pizza pizza = Pizza.XXL;
        System.out.println("Zamowiles pizze: " + pizza + " " + pizza.getRozmiar());
        System.out.println("Pizza kosztuje: " + pizza.getCena());
    }
}
