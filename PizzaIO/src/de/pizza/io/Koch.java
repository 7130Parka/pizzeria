package de.pizza.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Koch {

	public Pizza mach(Ofen ofen, String ... zutaten) {
		List<String> zutatenListe = new ArrayList<String>(Arrays.asList(zutaten));
		zutatenListe.remove("teig");
		Pizza pizza = new Pizza(zutatenListe);
		ofen.backe(pizza);
		return pizza;
	}

}
