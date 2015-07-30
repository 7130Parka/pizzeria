package de.pizza.oi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class PizzaMatcher extends TypeSafeMatcher<Pizza> {

	private final Set<String> zutaten;

	public PizzaMatcher(Set<String> zutaten) {
		this.zutaten = zutaten;
	}

	@Override
	public void describeTo(Description description) {
		description.appendValue(zutaten);
	}

	@Override
	protected boolean matchesSafely(Pizza pizza) {
		return pizza.getZutaten().equals(this.zutaten);
	}

	public static PizzaMatcher istBelegtMit(String... zutaten) {
		return new PizzaMatcher(new HashSet<String>(Arrays.asList(zutaten)));
	}

}
