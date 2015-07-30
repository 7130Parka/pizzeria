package de.pizza.oi;

public class BestellungsAnnahme {

	public void bestelle(String bestellung, Tisch tisch) {
		if (bestellung.equals("Pizza Margarita")) {
			tisch.liefere(new Pizza("Tomate", "Käse"));
		} else {
			tisch.liefere(new Pizza("Tomate"));
		}

	}

}
