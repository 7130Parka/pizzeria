package de.pizza.io;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SteinOfenTest {

	private SteinOfen steinOfen = new SteinOfen();

	private static Pizza nichtGebackenePizza() {
		return Pizza.ohneBelag();
	}
	
	@Test
	public void zuBeginnDesArbeitstagesIstDerSteinofenKalt() {
		assertThat(steinOfen.istHeiss(), is(FALSE));
	}

	@Test
	public void inNichtAufgeheiztemOfenBleibtPizzaRoh() {
		Pizza pizza = nichtGebackenePizza();
		steinOfen.backe(pizza);
		assertThat(pizza.istFertigGebacken(), is(FALSE));
	}

	@Test
	public void ofenKannAufgeheiztWerden() {
		steinOfen.aufheizen();
		assertThat(steinOfen.istHeiss(), is(TRUE));
	}
	
	@Test
	public void inAufgeheiztemOfenWirdPizzaFertiggebacken() {
		SteinOfen steinOfen = backbereiterOfen();
		Pizza pizza = nichtGebackenePizza();
		steinOfen.backe(pizza);
		assertThat(pizza.istFertigGebacken(), is(TRUE));
	}

	private SteinOfen backbereiterOfen() {
		return new SteinOfen().aufheizen();
	}
	

}
