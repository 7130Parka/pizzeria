package de.pizza.io;

import static de.pizza.io.PizzaMatcher.hatKeinenBelag;
import static java.lang.Boolean.FALSE;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PizzaTest {

	@Test
	public void teigIstKeinBelag() {
		assertThat(Pizza.ohneBelag(), hatKeinenBelag());
	}

	@Test
	public void neuePizzaIstUngebacken() {
		assertThat(Pizza.ohneBelag().istFertigGebacken(), is(FALSE));
	}

}
