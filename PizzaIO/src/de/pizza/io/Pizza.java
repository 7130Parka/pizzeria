package de.pizza.io;

import static java.util.function.Predicate.isEqual;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Pizza {

	public static Pizza ohneBelag() {
		return new Pizza(Arrays.asList("teig"));
	}

	private Set<String> zutaten;
	private boolean fertig;

	public Pizza(List<String> zutatenListe) {
		this.zutaten = new HashSet<String>(zutatenListe);
	}

	public Set<String> getBelag() {
		return this.zutaten.stream().filter(nichtTeig())
				.collect(Collectors.toSet());
	}

	private Predicate<Object> nichtTeig() {
		return isEqual("teig").negate();
	}

	@Override
	public String toString() {
		return "Pizza [zutaten=" + zutaten + "]";
	}

	public boolean istFertigGebacken() {
		return fertig;
	}

}
