package de.pizza.io;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MagicOvenTest {
	
	private final MagischerOfen magischerOfen = new MagischerOfen();
	
	@Test
	public void tomatenUndTeigGibtEinPizzabrot() throws Exception {
		PizzaBrot pizzaBrot = magischerOfen.backe("teig", "tomaten");
		assertThat( pizzaBrot, instanceOf(PizzaBrot.class));
	}
	
	@Test
	public void nurTeigGibtKeinPizzaBrot() throws Exception {
		PizzaBrot pizzaBrot = magischerOfen.backe("teig");
		assertThat( pizzaBrot, not(instanceOf(PizzaBrot.class)));
	}
}
