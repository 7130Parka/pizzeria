package de.pizza.oi;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.Test;

public class PizzaBestellTest {

	private HolzTisch tisch = new HolzTisch();

	@Test
	public void kannPizzabrotBestellen() {
		bestelle("Pizzabrot");
		assertThat(tisch.wasLiegtAufDemTisch(), isA(Pizzabrot.class));
	}
	
	@Test
	public void kannPizzaMargaritaBestellen() throws Exception {
		bestelle("Pizza Margarita");
		Pizza pizza = (Pizza)tisch.wasLiegtAufDemTisch();
		assertThat(pizza, isA(Pizza.class));
		assertThat(pizza.getZutaten(), hasItems("Tomate", "Käse"));
	}

	private void bestelle(String bestellung) {
		BestellungsAnnahme bestellungsAnnahme = new BestellungsAnnahme();
		bestellungsAnnahme.bestelle(bestellung, tisch);
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
