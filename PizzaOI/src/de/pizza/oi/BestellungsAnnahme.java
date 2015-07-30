package de.pizza.oi;

public class BestellungsAnnahme {

	public void bestelle(String bestellung, Tisch tisch) {
		tisch.liefere(new Pizzabrot());
		
	}

}
