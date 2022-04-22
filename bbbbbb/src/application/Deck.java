package application;

import java.util.Random;

import javafx.scene.image.Image;

public class Deck extends CardCollection {
	Random rand = new Random();
	
	public Deck() {
		super(52);
		populateDeck();
	}
	
	public void draw(Hand h) {
		int r = rand.nextInt(cards.size());
		h.addCard(cards.get(r));
		cards.remove(r);
		System.out.print(r);
		
	}
	
	public void deal(Hand h) {
		int r = rand.nextInt(cards.size());
		h.addCard(cards.get(r));
		cards.remove(r);
		System.out.print(r);

		
	}
	
	public void shuffle() {
		populateDeck();
	}
	
	public void populateDeck() {
		cards.clear();
		String[] suites = {"hearts","diamonds","spades","clubs"};
		int[] values= {2,3,4,5,6,7,8,9,10,10,10,10,1};
		String [] card={"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				String s = card[j] + "_of_" +suites[i]+".png";			
				addCard(new Card(s, values[j]));
				//System.out.print(s);
			}
		}
	
	
	}

}
