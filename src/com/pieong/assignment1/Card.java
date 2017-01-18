package com.pieong.assignment1;

public class Card {
	char value;
	Suit suit;
	boolean errorFlag;
	
	// Constructor with default values
	public Card(){
		
		this.value = 'A';
		this.suit = Suit.Spades;
		
		set('A', Suit.Spades);
	}
	
	// Constructor for custom values
	public Card(char value, Suit suit){
		
		// evaluate all characters as uppercase
		value = Character.toUpperCase(value);
		
		set(value, suit);
		
	}
	
	// stringizer to display the values
	
	public String toString(){
		
		if(errorFlag == true){
			return "** illegal **";
		}
		else{
			return value + " of " + suit;
		}
		
	}
	
	private static boolean isValid(char value, Suit suit){
		
		boolean isValid = false;
		char[] lookup = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
		
		for(char i : lookup){
			if(i == value){
				isValid = true;
			}
		}
		
		return isValid;
	}
	
	public boolean set(char value, Suit suit){
		
		// check if value is valid
		if(isValid(value, suit)){
			this.value = value;
			this.suit = suit;
			errorFlag = false;
		}
		else{
			errorFlag = true;
		}
		
		return errorFlag;
	}
	
	public boolean equals(Card card){
		if(card.value == this.value && card.suit == this.suit){
			return true;
		}
		else{
			return false;
		}
	}
	
	// Accessors
	
	public Suit getSuit(){
		return this.suit;
	}
	
	public char getValue(){
		return this.value;
	}
	
	public boolean getErrorFlag(){
		return this.errorFlag;
	}
}
