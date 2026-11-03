import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        char currency = '$';
        double total;
        int quantity;

        System.out.println("Enter the item name:");
        item = sc.nextLine();
        System.out.println("Enter the price of the item:");
        price = sc.nextDouble();
        System.out.println("Enter the quantity:");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("The item you bought is " + item );
        System.out.println("The price of the item is " + price + currency);
        System.out.println("The Total bill is " + total + currency);
        sc.close();
    }
}
