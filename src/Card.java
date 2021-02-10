import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Card {
    //These are the instance variables, they describe the
    //attributes that we want to model in the class.
    private String faceName, suit;
    private int faceValue;

    /**
     * The goal of the constructor is to allocate memory for the object.
     * When this is called, it will reserve space and return a "pointer"
     * to the object.
     *
     * A constructor does not have a "return" type and it must match the
     * name of the class
     */
    public Card(String faceName, String suit, int faceValue){
        this.faceName = faceName;
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This metjod will validate that the argument is hearts, diamonds,
     * spades, or clubs and set the instance variable
     * @param suit
     */
    public void setSuit(String suit) {
        List<String> validSuits = Arrays.asList("hearts", "diamonds", "spades", "clubs");
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " is not valid, valid options are: " + validSuits);
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public String toString(){
        return faceName + " of " + suit;
    }
}
