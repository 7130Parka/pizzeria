package de.pizza.io;

import static java.lang.Boolean.FALSE;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

public class SteinOfenTest {

	private static Pizza nichtGebackenePizza() {
		return Pizza.ohneBelag();
	}
	
	@Test
	public void zuBeginnDesArbeitstagesIstDerSteinofenKalt() {
		SteinOfen steinOfen = new SteinOfen();
		assertThat(steinOfen.istHeiss(), is(FALSE));
	}

	@Test
	public void inNichtAufgeheiztemOfenBleibtPizzaRoh() {
		SteinOfen steinOfen = new SteinOfen();
		Pizza pizza = nichtGebackenePizza();
		steinOfen.backe(pizza);
		assertThat(pizza.istFertigGebacken(), is(FALSE));
	}

	@Test
	@Ignore
	public void test() {
		SteinOfen steinOfen = new SteinOfen();
		// steinOfen.aufwärmen();
		// steinOfen.backe(pizza);
		fail("Not yet implemented");
	}

}
