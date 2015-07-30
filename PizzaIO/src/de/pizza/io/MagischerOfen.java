package de.pizza.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagischerOfen {

	public Pizza backe(String ... zutaten) {
		List<String> zutatenListe = new ArrayList(Arrays.asList(zutaten));
		zutatenListe.remove("teig");
		return new Pizza(zutatenListe);
	}

}
