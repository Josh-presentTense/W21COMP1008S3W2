import java.util.ArrayList;

public class CardTester {
    public static void main(String[] args) {

        //instantiating objects...
        Card aceOfSpades = new Card("Ace","Spades",14);
        Card twoOfHearts = new Card("Two","Hearts",2);
        Card crazyCard = new Card("Eight","Clubs",7);
        crazyCard.setSuit("Spades");
        crazyCard.setFaceValue(14);

        System.out.println(aceOfSpades);
        System.out.println(twoOfHearts);
        System.out.println(crazyCard);

        //showing how and why we add data types to Lists
        ArrayList arrayList = new ArrayList();
        arrayList.add("foofoo");
        arrayList.add(1862563);
        arrayList.add(aceOfSpades);

        //Iterate over a list of different data types
        for (Object myObject : arrayList)
            System.out.println(myObject.getClass());

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("foofoo");
        stringArrayList.add("123234");
        stringArrayList.add("hello world");

        //Iterate over a list of specified types, allows us to use the methods
        //of that class
        for (String string : stringArrayList)
            System.out.println(string.toUpperCase());

        arrayList.addAll(stringArrayList);
        System.out.println(stringArrayList.get(0));
        arrayList.remove(aceOfSpades);

        ArrayList<Card> myHand = new ArrayList<>();
        myHand.add(aceOfSpades);
        myHand.add(crazyCard);
        myHand.add(twoOfHearts);
        System.out.println(myHand);

        for (Card card : myHand)
            System.out.println(card.getFaceValue() + 10);

        for (int i=0; i<myHand.size(); i+=2)
            System.out.println(myHand.get(i).getFaceValue() + 10);

        DeckOfCards deck = new DeckOfCards();
        System.out.printf("%nThe deck of cards has %d cards in it%n", deck.getNumOfCardsInDeck());

        deck.shuffle();

        System.out.println("Here are the first 5 cards:");
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.printf("The deck of cards has %d cards in it%n", deck.getNumOfCardsInDeck());
    }
}