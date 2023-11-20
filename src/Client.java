import java.math.BigDecimal;
import java.util.Scanner;

public class Client {
    private String firstName;
    private String lastName;
    private int age;
    private Card card;
    private Basket basket;


    public Client(String firstName, String lastName, int age, Card card, Basket basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "\nClient{" +
                "firstName='" + firstName + '\'' +
                "lastName='" + lastName + '\'' +
                "age=" + age +"\n\n"+
                "card=" + card +"\n\n"+
                "basket=" + basket +
                "}\n";
    }
}
