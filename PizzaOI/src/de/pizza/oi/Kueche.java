package de.pizza.oi;

public class Kueche {

	public Pizza erstelle(String bestellung) {
		if (bestellung.equals("Pizza Margarita")) {
			return new Pizza("Tomate", "Käse");
		} else {
			return new Pizza("Tomate");
		}
	}

}
