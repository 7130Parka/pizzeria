package de.pizza.oi;

import static de.pizza.oi.PizzaMatcher.istBelegtMit;
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
		assertThat(tisch.wasLiegtAufDemTisch(), istBelegtMit("Tomate", "Käse"));
	}

	private void bestelle(String bestellung) {
		BestellungsAnnahme bestellungsAnnahme = new BestellungsAnnahme();
		bestellungsAnnahme.bestelle(bestellung, tisch);
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
