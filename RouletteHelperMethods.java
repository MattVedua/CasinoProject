/**
 * This class contains methods to help the GUI to 
 * determine various things, such as winnings, loses, etc.
 * @author Matthew Vedua
 * @author Garrett Gugs
 */
public class RouletteHelperMethods extends RouletteGUI{
	private static int randomTile;
	
	/** Decides if the user wins or loses
	 *  
	 * @param type The type of bet the user makes
	 * @return 1 if the user wins, 0 if they lose
	 */
	public static int doBet(String type){
		balance -= bet;
		boolean isEqual = true;
		randomTile = ((int)(Math.random()*36)+1);
		switch(type){
			case "Straight":
				int numStClicked = Integer.parseInt(clickedOn.get(0).getText());
				if(numStClicked == randomTile){
					RouletteHelperMethods.winnings(type);
					return 1;
				} else {
					return 0;
				}
			/* Ends Straight */
			case "Split":
			case "Square":
			case "Six Line":
			case "Street":
				for(int i = 0 ; i < clickedOn.size() ; i++){
					int numClicked = Integer.parseInt(clickedOn.get(i).getText());
					if(numClicked == randomTile){
						isEqual = true;
						break;
					} else {
						isEqual = false;
					}
				}
				if(isEqual){
					RouletteHelperMethods.winnings(type);
					return 1;
				} else {
					return 0;
				}
			/* Ends Split, Corner, Six Line, Street */
				default: return -1;
		}
	}

	/** Checks if the user bet on the appropriate number
	 * of tiles for their bet
	 * 
	 * @param The type of a bet the user makes
	 * @return True if they bet corectly, false if not
	 */
	public static boolean checkNumTiles(String betType){
		if(clickedOn.size() == tilesForBet(betType)){
			return true;
		} else {
			return false;
		}
	}
	
	/** Provides the correct number of tiles to be bet on
	 * 
	 * @param The type of a bet the user makes
	 * @return The appropriate number of tiles the user should bet on
	 */
	public static int tilesForBet(String betType){
		switch(betType){
		case "Straight":
			return 1;
		/* Ends Straight */
		case "Split":
			return 2;
		/* Ends Split */
		case "Square":
			return 4;
		/* Ends Square */
		case "Six Line":
			return 6;
		/* Ends Six Line */
		case "Street":
			return 3;
		/* Ends Street ,*/
			default: 
				return -1;
		}
	}
	/** Calculates the winnings of a bet
	 * 
	 * @param kindOfBet The type of bet the user makes
	 */
	public static void winnings(String kindOfBet){
		int payout = (36/tilesForBet(kindOfBet)) - 1;
		balance = balance + (bet * payout);
	}
	
	public static int getRandomTile(){return randomTile;}
}
