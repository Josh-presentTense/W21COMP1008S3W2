public class CardTester {
    public static void main(String[] args) {

        //instantiating objects...
        Card aceOfSpades = new Card("Ace", "Spades", 14);
        Card twoOfHearts = new Card("Two", "Hearts", 2);
        Card crazyCard = new Card("Crazy", "MySuit", 177013);
        crazyCard.setSuit("Howdy");

        System.out.println(aceOfSpades);
        System.out.println(twoOfHearts);
    }
}
