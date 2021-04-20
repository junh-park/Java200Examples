package com.jun.Java200Examples;

import org.junit.Before;
import org.junit.Test;

import com.jun.card.Card;
import com.jun.card.CardCase;
import com.jun.card.CardRule;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertTrue;

public class CardRuleTest {

	private final CardRule rule = new CardRule();
	
	@Test
	public void when_card_containing_c_is_passed_returns_true() {
		Card card = new Card("C4");
		
		assertTrue(rule.isLight(card));
		
		
	}
	
}
