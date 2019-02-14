/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    public static void main(String[] args) {
        Card card1 = new Card("7", "Diamond", 7);
        Card card2 = new Card("2", "Spades", 2);
        Card card3 = new Card("5", "Clubs", 5);
        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println(card3.toString());
        card1.matches(card2);
    }
}
