package de.pizza.oi;

public class Kellner {

	private final Kueche kueche;

	public Kellner(Kueche kueche) {
		this.kueche = kueche;
	}

	public BestellAntwort bestelle(String bestellung, Tisch tisch) {
		// TODO Sollte �ber Methode mit dem Gast kommunizieren statt via returntype (Kommunikationskan�le). 
		tisch.liefere(kueche.erstelle(bestellung));
		return new BestellAntwort();
	}

}
