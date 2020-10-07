import java.lang.Math;

public class PickACard {
    public static void main(String[] args) {
        int rank = (int)(Math.random() * 13);
        int suit = (int)(Math.random() * 5);

        String strRank = "";
        String strSuit = "";

        switch(rank){
            case 0:
                strRank = "Ace";
                break;
            case 1:
                strRank = "2";
                break;
            case 2:
                strRank = "3";
                break;
            case 3:
                strRank = "4";
                break;
            case 4:
                strRank = "5";
                break;
            case 5:
                strRank = "6";
                break;
            case 6:
                strRank = "7";
                break;
            case 7:
                strRank = "8";
                break;
            case 8:
                strRank = "9";
                break;
            case 9:
                strRank = "10";
                break;
            case 10:
                strRank = "Jack";
                break;
            case 11:
                strRank = "Queen";
                break;
            case 12:
                strRank = "King";
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
