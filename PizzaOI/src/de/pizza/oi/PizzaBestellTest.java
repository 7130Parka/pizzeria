package de.pizza.oi;

import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PizzaBestellTest {

	@Test
	public void kannFertigesPizzabrotBestellen() {
		BestellungsAnnahme bestellungsAnnahme = new BestellungsAnnahme();
		HolzTisch tisch = new HolzTisch();
		bestellungsAnnahme.bestelle("Pizzabrot", tisch);
		assertThat(tisch.wasLiegtAufDemTisch(), isA(Pizzabrot.class));
	}

	private static class HolzTisch implements Tisch {

		private Pizzabrot pizzabrot;

		@Override
		public void liefere(Pizzabrot pizzabrot) {
			this.pizzabrot = pizzabrot;

		}

		@Override
		public Pizzabrot wasLiegtAufDemTisch() {
			return this.pizzabrot;
		}

	}
	
}
