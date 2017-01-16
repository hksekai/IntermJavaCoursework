package com.pieong.assignment1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card = new Card('a', Suit.Diamonds);
		Card card1 = new Card();
		Card card2 = new Card('C', Suit.Diamonds);
		
		System.out.println(card2.toString());
		card2.set('T', Suit.Hearts);
		System.out.println(card2.toString());
	}

}
