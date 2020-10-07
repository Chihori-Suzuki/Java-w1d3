import java.lang.Math;

public class PickACard {
    public static void main(String[] args) {

        int max = 13; 
        int min = 1; 
        int range = max - min + 1; 
        int rank = (int)(Math.random() * range) + min;

        int suit = (int)(Math.random() * 4);

        String strRank = "";
        String strSuit = "";

        switch(rank){
            case 1:
                strRank = "Ace";
                break;
            case 11:
                strRank = "Jack";
                break;
            case 12:
                strRank = "Queen";
                break;
            case 13:
                strRank = "King";
                break;
            default:
                strRank = Integer.toString(rank);
                break;
        }

        switch(suit){
            case 0:
                strSuit = "Clubs";
                break;
            case 1:
                strSuit = "Diamonds";
                break;
            case 2:
                strSuit = "Hearts";
                break;
            case 3:
                strSuit = "Spades";
                break;
        }

        System.out.println("The card you picked is " + strRank + " of " + strSuit);
    }

}
