package by.lesson.bouquet.additional.accessories;

import by.lesson.bouquet.additional.Accessories;

public class Ribbon extends Accessories {

	private static int amount;

	public static int getAmount() {
		return amount;
	}

	public Ribbon(String title, String color, int amount) {
		super.setTitle(title);
		super.setColor(color);
		this.amount = amount;
		prepareAccessory();
	}

	public void prepareAccessory() {
		if (this.amount > 1) {
			super.parameters = this.amount + " amount (x" + this.amount + ")" + ", " + super.getColor() + " colour";
		} else if (this.amount == 1) {
			super.parameters = this.amount + " amount, " + super.getColor() + " colour";
		}
	}

}
