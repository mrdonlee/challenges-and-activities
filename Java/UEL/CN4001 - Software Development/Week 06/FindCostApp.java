import java.util.Scanner;
public class FindCostApp {
    public static void main(String[] args) {
        Scanner kbd= new Scanner(System.in);
        double price, tax;

        System.out.println("*** Product Price Check ***");

        System.out.print("Enter initial price: ");
        price = kbd.nextDouble();

        System.out.print("Enter tax rate: ");
        tax = kbd.nextDouble();

        price = price * (1 + tax/100);

        System.out.println("Cost after tax = " + price);
    }
}