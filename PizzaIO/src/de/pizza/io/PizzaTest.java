package de.pizza.io;

import static de.pizza.io.PizzaMatcher.hatKeinenBelag;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaTest {

	private Pizza beliebigePizza = Pizza.ohneBelag();;

	@Test
	public void teigIstKeinBelag() {
		assertThat(Pizza.ohneBelag(), hatKeinenBelag());
	}

	@Test
	public void neuePizzaIstUngebacken() {
		assertThat(beliebigePizza.istFertigGebacken(), is(FALSE));
	}
	
	@Test
	public void erhitztePizzaWirdFertig() throws Exception {
		beliebigePizza.erhitze();
		assertThat(beliebigePizza.istFertigGebacken(), is(TRUE));
	}

}
