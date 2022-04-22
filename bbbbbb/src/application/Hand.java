package application;

public class Hand extends CardCollection {
	
	public Hand() {
		super(5);
	}
	
	public int getValue() {
		int value = 0;
		for (int i = 0; i < cards.size(); i++) {
			value = value + cards.get(i).getValue();
		}
		return value;
	}
	
	public String toString() {
		String output = "";
		for(int i = 0; i < cards.size(); i++) {
			output += cards.get(i) + " ";
		}
		output += String.format("Showing: (%d) ", getValue());
		return output;
	}
	
	public void flip() {
		cards.get(cards.size() - 1).flip();
	}
	
	public void flipAll() {
		for(int i = 0; i < cards.size(); i++) {
			if(cards.get(i).isFlipped() == true) {
				
			}
			else {
				cards.get(i).flip();
			}
			
		}
	}

}
