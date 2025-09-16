public class Main {
    public static void main(String[] args) {
        double price = 37.50;
        double taxRate = 0.05;
        double salesTax = price * taxRate;
        double totalWithTax = price + salesTax;

        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println("Sales tax (5%): $" + String.format("%.2f", salesTax));
        System.out.println("Total: $" + String.format("%.2f", totalWithTax));
    }
}