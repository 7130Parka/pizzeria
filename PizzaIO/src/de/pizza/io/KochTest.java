package de.pizza.io;

import static de.pizza.io.PizzaMatcher.istBelegtMit;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class KochTest {

	private final Koch koch = new Koch();

	private Ofen ofen = new SteinOfen();

	@Test
	public void tomatenUndTeigGibtEinPizzabrot() {
		Pizza pizzaBrot = koch.mach(ofen, "teig", "tomaten");
		assertThat(pizzaBrot, istBelegtMit("tomaten"));
	}

	@Test
	public void tomatenUndTeigUndKäseGibtEinePizzaMargarita() {
		Pizza pizza = koch.mach(ofen, "tomaten", "teig", "käse");
		assertThat(pizza, istBelegtMit("tomaten", "käse"));
	}

	@Test
	public void nurTeigGibtKeinPizzaBrot() {
		Pizza pizzaBrot = koch.mach(ofen, "teig");
		assertThat(pizzaBrot, istBelegtMit());
	}
}
