package com.pieong.assignment1;

public class Hand {
	Card[] myCards;
	static int numCards;
	public static final int MAX_CARDS = 30;
	
	public Hand(){
		myCards = new Card[MAX_CARDS];
	}
	
	public Hand(int size){
		
		if(size == 0 || size > MAX_CARDS){
			System.out.println("Invalid hand");
		}else{
			myCards = new Card[size];
		}
		
	}
	
	public void resetHand(){
		this.myCards = new Card[MAX_CARDS];
	}
	
	public boolean takeCard(Card card){
		
		// find the next available position in myCards
		int index = numCards() ;
		
		// if index is greater than max cards return false
		if(index >= MAX_CARDS){
			return false;
		}
		// insert card into last available index
		else{
			myCards[index] = card;
			return true;
		}
		
		
		
	}
	
	public String toString(){
		
		String hand = "";
	
		// Iterate through myCards array
		for(int i = 0; i<numCards(); i++){
			
			hand = hand + myCards[i].toString() + ",";
		}
		
		// Remove trailing  comma
		hand = hand.replaceAll(",$", "");
		
		// Insert output string into parenthesis
		hand = "Hand =  (" + hand + ")";
		return hand;
	}
	
	public int numCards(){
		int index = 0;
		for(int i = 0; i < myCards.length; i++){
			if(myCards[i] != null){
				index++;
			}
		}
		numCards = index;
		return numCards;
	}
	
	public Card playCard(){
		int lastCard = numCards() - 1;
		Card drawCard = myCards[lastCard];
		myCards[lastCard] = null;
		
		return drawCard;
		
	}
	
	public Card inspectCard(int k){
		
		Card dummy = new Card('C', Suit.Clubs);
		
		if(k > numCards() -1 ){
			return dummy;
		}
		
		return myCards[k];
		
		
	}

}
