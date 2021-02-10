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

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}
