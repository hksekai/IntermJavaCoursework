package com.pieong.assignment1;

public class Hand {
	Card[] myCards;
	static final int MAX_CARDS = 30;
	
	public Hand(){
		myCards = new Card[MAX_CARDS];
	}
	
	public void resetHand(){
		this.myCards = new Card[MAX_CARDS];
	}
	
	public boolean takeCard(Card card){
		
		// If errorFlag = false (card has error) return false;
		if(card.errorFlag == false){
			return false;
		}
		
		// Find the first index where myCards is null and insert 
		for(int i = 0; i < myCards.length; i++){
			
			// if iterator goes past max cards, return false;
			if(i > MAX_CARDS){
				return false;
			}
			
			if(myCards[i] == null){
				System.out.println("index "  + i + " is null. adding card: "  + card.toString());
				myCards[i] = card;
				break;
			}
			
		}
		
		return true;
	}
	
	public String toString(){
		
		String hand = "";
	
		// Iterate through myCards array
		for(int i = 0; i<myCards.length; i++){
			
			// Add only cards at index that is not empty
			if(myCards[i] != null) {
				hand = hand + myCards[i].toString() + ",";
			}
		}
		
		// Remove trailing  comma
		hand = hand.replaceAll(",$", "");
		
		// Insert output string into parenthesis
		hand = "(" + hand + ")";
		return hand;
	}
	/*
	public Card playCard(){
		
	}*/
	
	public static void main(String[] args){
		
		Hand hand = new Hand();
		Card card = new Card('A', Suit.Diamonds);
		Card card2 = new Card('3', Suit.Clubs);
		Card card3 = new Card('c', Suit.Spades);
		
		hand.takeCard(card);
		hand.takeCard(card2);
		hand.takeCard(card3);
		System.out.println(hand.toString());
		
		hand.resetHand();
		
		System.out.println(hand.toString());
	}
}
