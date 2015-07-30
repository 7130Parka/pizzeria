package de.pizza.oi;

import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.junit.Test;

public class PizzaBestellTest implements Tisch {

	private Pizzabrot pizzabrot;

	@Test
	public void kannFertigesPizzabrotBestellen() {
		BestellungsAnnahme bestellungsAnnahme = new BestellungsAnnahme();
		bestellungsAnnahme.bestelle("Pizzabrot", this);
		assertThat(this.wasLiegtAufDemTisch(), isA(Pizzabrot.class));
	}

	public Pizzabrot wasLiegtAufDemTisch() {
		return pizzabrot;
	}

	@Override
	public void liefere(Pizzabrot pizzabrot) {
		this.pizzabrot = pizzabrot;
	}

}
