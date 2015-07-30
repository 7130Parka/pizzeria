package de.pizza.io;

import java.util.Arrays;
import java.util.List;

public class MagischerOfen {

	public PizzaBrot backe(String ... zutaten) {
		List<String> zutatenListe = Arrays.asList(zutaten);
		if( 2 == zutatenListe.size()){
			return new PizzaBrot();			
		}
		return null;
	}

}
