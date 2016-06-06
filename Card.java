public class Card{
    int suit;
    int value;
    int cardNum;
    Card(){
        cardNum = (int)(Math.random()*13)+1;
        if(cardNum > 10){
            value = 10;
        } else {
            value = cardNum;
        }
        suit = (int)(Math.random()*4);
    }

    public void setSuit() {
        suit = (int)(Math.random()*4);
    }

    public String getCardSuit(){
        switch(suit){
            case 0: return "♣";
            case 1: return "♦";
            case 2: return "♥";
            case 3: return "♠";
            default: return "";
        }
    }

    public void setValue(int val){
        value = val;
    }

    public String getNameValue(){
        switch(cardNum){
            case 1: return "A";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "10";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return "";
        }
    }
}
