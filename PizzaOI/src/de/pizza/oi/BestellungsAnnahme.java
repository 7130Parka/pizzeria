package de.pizza.oi;

public class BestellungsAnnahme {

	public void bestelle(String bestellung, Tisch tisch) {
		if (bestellung.equals("Pizza Margarita")) {
			tisch.liefere(new Pizza("Tomate", "K�se"));
		} else {
			tisch.liefere(new Pizza("Tomate"));
		}

	}

}
