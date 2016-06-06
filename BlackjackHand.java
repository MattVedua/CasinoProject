import java.util.*;

import javax.swing.JOptionPane;
public class BlackjackHand extends BlackjackGUI{
    static List<Card> playerHand = new ArrayList<Card>();
    static List<Card> dealerHand = new ArrayList<Card>();

    BlackjackHand(){
        playerHand.clear();
        dealerHand.clear();
        playerHand.add(new Card());
        playerHand.add(new Card());
        dealerHand.add(new Card());
        dealerHand.add(new Card());
    }

    @Override
    public String toString(){
        String output = "The Dealer's first card is:\n";
        output += dealerHand.get(0).getNameValue() + dealerHand.get(0).getCardSuit() +"\n";
        output += "\nYour cards are:" + "\n";
        for(int i = 0 ; i < playerHand.size() ; i++){
            output += playerHand.get(i).getNameValue() + playerHand.get(i).getCardSuit() +"\n";
        }
        return output;
    }

    public static String printHand(String who){
        String hand = "";
        if(who.equals("user")){
            for(int i = 0 ; i < playerHand.size(); i++){
                hand += playerHand.get(i).getNameValue() + playerHand.get(i).getCardSuit() + "  ";
            }
        } 
        else {
            hand += dealerHand.get(0).getNameValue() + dealerHand.get(0).getCardSuit() + "  ";
        }
        return hand;
    }

    public static String printDealerHand(){
        String hand = "";
        for(int i = 0 ; i < dealerHand.size(); i++){
            hand += dealerHand.get(i).getNameValue() + dealerHand.get(i).getCardSuit() + "  ";
        }
        return hand;
    }

    public static int calcHand(String who){
        int sumValue = 0;
        if(who.equals("user")){
            for(int i = 0 ; i < playerHand.size() ; i++){
                sumValue += playerHand.get(i).value;
            }
        } else {
            for(int i = 0 ; i < dealerHand.size() ; i++){
                sumValue += dealerHand.get(i).value;
            }
        }
        return sumValue;
    }

    public static int checkWinner(){ 
        if(calcHand("user") > 21){ // 0 = Bust
            balance -= bet;
            return 0;
        }
        if(calcHand("user") <= calcHand("dealer")){// 1 = dealer bust
            if(calcHand("dealer") > 21){
                balance += bet;
                return 1;
            }
            balance -= bet;
            return 2; // 2 = User < Dealer
        } else {
            balance += bet;
            return 3; // 3 = user > dealer

        }  

    }

    public static void checkAce(){
        Object[] possibilities = {"1","11"};
        for(int i = 0 ; i < playerHand.size() ; i++){
            if(playerHand.get(i).value == 1 || playerHand.get(i).value == 11){
                playerHand.get(i).value = Integer.parseInt((String)(JOptionPane.showInputDialog(null,"What would your ace to be worth?","Ace Worth",JOptionPane.PLAIN_MESSAGE,null,possibilities,"1")));
            }
        }
    }

    public static void hitDealer(){
        while(calcHand("dealer") < 17){
            dealerHand.add(new Card());
        }
    }
}