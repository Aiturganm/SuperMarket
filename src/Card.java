import java.util.Scanner;

public class Card implements CardInterface{
    private String firstname;
    private String lastname;
    private long cardnumber;
    private double balance;
    private String password;

    public Card(){}
    public Card(String firstname, String lastname, long cardnumber, double balance, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cardnumber = cardnumber;
        this.balance = balance;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(long cardnumber) {
        this.cardnumber = cardnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void payWithCard(double money) {
        // сатылып алынган продуктанын квитанциясы
        System.out.println(money);
    }

    @Override
    public double getcardbalance(double money) {
        // картадагы балансты кайтарат
        this.balance -=money;
        return this.balance;

    }

    @Override
    public String toString() {
        return "Card{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", cardnumber=" + cardnumber +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}
