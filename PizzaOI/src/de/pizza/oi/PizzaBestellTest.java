package de.pizza.oi;

import static de.pizza.oi.PizzaMatcher.istBelegtMit;
import static java.lang.Boolean.FALSE;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PizzaBestellTest {

	private HolzTisch tisch = new HolzTisch();

	@Test
	public void kannPizzabrotBestellen() {
		bestelle("Pizzabrot");
		assertThat(tisch.wasLiegtAufDemTisch(), istBelegtMit("Tomate"));
	}

	@Test
	public void kannPizzaMargaritaBestellen() {
		bestelle("Pizza Margarita");
		assertThat(tisch.wasLiegtAufDemTisch(), istBelegtMit("Tomate", "K‰se"));
	}

	@Test
	public void ungueltigeBestellung() {
		BestellAntwort antwort = bestelle("Pizza mit Scheiﬂe");
		assertThat(antwort.isAngenommen(), is(FALSE));
	}

	private BestellAntwort bestelle(String bestellung) {
		return new Kellner(new Kueche()).bestelle(bestellung, tisch);
	}

	private static class HolzTisch implements Tisch {

		private Pizza pizzabrot;

		@Override
		public void liefere(Pizza pizzabrot) {
			this.pizzabrot = pizzabrot;

		}

		@Override
		public Pizza wasLiegtAufDemTisch() {
			return this.pizzabrot;
		}

	}

}
