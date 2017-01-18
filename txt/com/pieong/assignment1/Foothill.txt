package com.pieong.assignment1;

public class Foothill {

	public static void main(String[] args) {
		
		// Run for phase 1:
		
		
		System.out.println("/* -----------BEGIN PHASE ONE------------------- ");
		
		Card card1 = new Card('a', Suit.Diamonds);
		Card card2 = new Card();
		Card card3 = new Card('C', Suit.Diamonds);
		
		
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
		
		card2.set('G', Suit.Hearts);
		card3.set('7', Suit.Hearts);
		
		System.out.println("\n");
		
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
		
		System.out.println("-------------END PHASE ONE------------------- */\n");
		
		// Run for phase 2:
		System.out.println("/* -----------BEGIN PHASE TWO------------------- ");
		
		Hand hand = new Hand();
		
		Card card4 = new Card('A', Suit.Diamonds);
		Card card5 = new Card('3', Suit.Clubs);
		Card card6 = new Card('T', Suit.Spades);
		Card card7 = new Card('7', Suit.Clubs);
		Card card8 = new Card('6', Suit.Hearts);
		
		hand.takeCard(card4);
		hand.takeCard(card5);
		
		System.out.println("Taking two cards initially...");
		System.out.println(hand.toString());
		
		hand.playCard();
		
		System.out.println("Here is the hand after playing one card: " + hand.toString() + "\n");
		
		System.out.println("Testing inspectCard()");
		System.out.println(hand.inspectCard(0)); // Good Card
		System.out.println(hand.inspectCard(33)); // Out of Bounds
		System.out.println(hand.inspectCard(1)); // Null card
		System.out.println("\n");
		
		System.out.println("Now filling the hand with the remaining cards ...\n");
		while(hand.numCards() < hand.MAX_CARDS){
			
			hand.takeCard(card6);
			hand.takeCard(card7);
			hand.takeCard(card8);
			hand.takeCard(card4);
			hand.takeCard(card5);
			
		}
		System.out.println("Hand full\nAfter deal");
		System.out.println(hand.toString());
		
		while(hand.numCards() > 0){
			System.out.println("Playing " + hand.playCard());
		}
		
		System.out.println("After playing all cards");
		System.out.println(hand.toString());
		
		System.out.println("-------------END PHASE TWO------------------- */\n");
	}

}
