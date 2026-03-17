package primeiroprograma01;

public class Exercicio1 {
    public static void main(String[] args) {
        String product2 = "Office Desk";
        String product1 = "Computer";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: %n%s, which price is $ %.2f%n%s, whic price is $ %.2f%n%nRecord: %d years old, code %d and gender: %s%n%nMeasure with eight decimal places: %.8f%nRouded (three decimal places): %.3f%n", product1, price1, product2, price2, age, code, gender, measure, measure);
    }
}
