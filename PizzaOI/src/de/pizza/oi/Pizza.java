package de.pizza.oi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pizza {

	private Set<String> zutaten;

	public Pizza(String... zutaten) {
		this.zutaten = new HashSet<String>(Arrays.asList(zutaten));
	}

	public Set<String> getZutaten() {
		return zutaten;
	}

	@Override
	public String toString() {
		return "Pizza [zutaten=" + zutaten + "]";
	}

}
