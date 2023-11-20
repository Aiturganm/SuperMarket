import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("Bread", BigDecimal.valueOf(30)),
                new Product("Juice", BigDecimal.valueOf(100)),
                new Product("Bag", BigDecimal.valueOf(1200)),
                new Product("Shampoo", BigDecimal.valueOf(450))
        };
        Card card = new Card("Aiturgan", "Maksatbek kyzy", 94171789, 4560, "a0307");
        Basket basket = new Basket(products);
        Client client = new Client("Aiturgan", "Maksatbek kyzy", 19, card, basket);
        System.out.println(client);

        BigDecimal allSum = BigDecimal.valueOf(0);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
            allSum = allSum.add(products[i].getPrice());
        }

        int result = allSum.compareTo(BigDecimal.valueOf(100));
        if(result>0){
            System.out.println("\nYou must pay by card. ");
            System.out.println("\nEnter password: ");
            if(new Scanner(System.in).nextLine().equals(card.getPassword())){
                System.out.println("\nYou can continue");
                if(allSum.floatValue()<=card.getBalance()){
                    System.out.println();
                    for (int i = 0; i < products.length; i++) {
                        System.out.println(products[i]);
                        System.out.println(products[i].getPrice() +"\n");
                    }
                    System.out.println("All sum: " + allSum);
                    System.out.print("\nYOU HAVE PAYED BY CARD. YOU HAVE ");
                    System.out.println(card.getcardbalance(allSum.floatValue()));
                    System.out.print(" SOM LEFT\n");
                }else System.out.println("You don't have enough money");
            }else System.out.println("Invalid password");
        }
    }
}