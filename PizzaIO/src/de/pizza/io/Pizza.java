package de.pizza.io;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pizza {
	
	private Set<String> zutaten;

	public Pizza(List<String> zutatenListe) {
		this.zutaten = new HashSet<String>(zutatenListe);
	}

	public Set<String> getZutaten() {
		return zutaten;
	}

	@Override
	public String toString() {
		return "Pizza [zutaten=" + zutaten + "]";
	}
}
