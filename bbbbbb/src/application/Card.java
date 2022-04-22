package application;

public class Card {
	
	private String name;
	private int value;
	private boolean isFlipped = false;
	
	public Card(String s, int v) {
		this.name = s;
		
		this.value = v;
	}	

	public String toString() {
		String output;
			output = String.format("%s", this.name);
		System.out.print(output);
		return output;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean isFlipped() {
		return this.isFlipped;
	}
	
	public void flip() {
		this.isFlipped =! this.isFlipped;
	}

}
