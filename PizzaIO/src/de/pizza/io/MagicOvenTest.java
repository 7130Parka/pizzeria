package de.pizza.io;

import static de.pizza.io.PizzaMatcher.istBelegtMit;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import org.junit.Test;

public class MagicOvenTest {
	
	private final MagischerOfen magischerOfen = new MagischerOfen();
	
	@Test
	public void tomatenUndTeigGibtEinPizzabrot() throws Exception {
		Pizza pizzaBrot = magischerOfen.backe("teig", "tomaten");
		assertThat(pizzaBrot, istBelegtMit("tomaten"));
	}
	
	@Test
	public void tomatenUndTeigUndKäseGibtEinePizzaMargarita() throws Exception {
		Pizza pizza = magischerOfen.backe("tomaten", "teig", "käse");
		assertThat(pizza, istBelegtMit("tomaten", "käse"));
	}
	
	@Test
	public void nurTeigGibtKeinPizzaBrot() throws Exception {
		Pizza pizzaBrot = magischerOfen.backe("teig");
		assertThat(pizzaBrot, istBelegtMit());
	}
}
