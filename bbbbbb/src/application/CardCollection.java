package application;

import java.util.ArrayList;

public abstract class CardCollection {

	protected ArrayList<Card> cards;
	
	protected CardCollection(int size) {
		this.cards = new ArrayList<>(size);
	}
	
	public void addCard(Card c) {
		this.cards.add(c);
	}
	
	public void removeCard(Card c) {
		this.cards.remove(c);
		System.out.print(c);
	}
	
	
}
