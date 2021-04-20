package com.jun.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardCase {
	private List<Card> cards = new ArrayList<Card>();

	public CardCase() {
		cards.clear();
	}

	public List<Card> getCards() {
		return cards;
	}

	public int count() {
		return cards.size();
	}

	public Card getCard(int index) {
		return cards.get(index);
	}

	public void make() {
		cards.clear();
		int suit = CardUtil.SUIT.length;
		int value = CardUtil.VALUE.length;
		int count = 0;

		while (count != value * suit) {
			Card c = new Card();
			if (!cards.contains(c)) {
				cards.add(c);
				count++;
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public void sort() {
		Comparator<Card> comp = new Comparator<Card>() {

			@Override
			public int compare(Card c1, Card c2) {
				return c1.getCardVal().compareTo(c2.getCardVal());
			}
		};
		cards.sort(comp);
	}

	public void rsort() {
		cards.sort(new Comparator<Card>() {

			@Override
			public int compare(Card c1, Card c2) {
				return -1 * c1.getCardVal().compareTo(c2.getCardVal());
			}
		});
	}

	public void lambdasort() {
		cards.sort((Card c1, Card c2) -> {
			return c1.getCardVal().compareTo(c2.getCardVal());
		});
	}

	public void lambdasort2() {
		cards.sort(Comparator.comparing(Card::getCardVal));
	}
	
	public void lambdasort3() {
		cards.sort(Card::compareCard);
	}
	
	public void lambdarsort() {
		cards.sort((c1, c2) -> -c1.getCardVal().compareTo(c2.getCardVal()));
	}

	public void lambdarsort2() {
		Comparator<Card> mycard = (c1, c2) -> c1.getCardVal().compareTo(c2.getCardVal());
		cards.sort(mycard.reversed());
	}
	
	public void lambdarsort3() {
		cards.sort(Card::compareRCard);
	}
	
	public void print() {
		int value = CardUtil.VALUE.length;
		for (int i = 0; i < cards.size(); i++) {
			Card c = cards.get(i);
			System.out.printf("%s", c.toString());
			if ((i + 1) % value == 0) {
				System.out.println();
			}
		}
	}
	
	
	
	
}
