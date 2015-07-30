package de.pizza.io;

public class SteinOfen implements Ofen {

	private boolean heiss;

	@Override
	public void backe(Pizza pizza) {
		if(heiss){
			pizza.erhitze();
		}
	}

	public boolean istHeiss() {
		return heiss;
	}

	public SteinOfen aufheizen() {
		heiss = true;
		return this;
	}

}
