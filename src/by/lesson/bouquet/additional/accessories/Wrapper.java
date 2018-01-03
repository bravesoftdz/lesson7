package by.lesson.bouquet.additional.accessories;

import by.lesson.bouquet.additional.Accessories;

public class Wrapper extends Accessories {

	private String shape;
	private double priceWrapper;

	public Wrapper(String title, String color, String shape) {
		super.setTitle(title);
		super.setColor(color);
		this.shape = shape;
		prepareAccessory();
	}

	public void prepareAccessory() {
		super.parameters = this.shape + " shape, " + super.getColor() + " colour";
	}

	public double getPriceWrapper() {
		return priceWrapper;
	}

	public void setPriceWrapper(double priceWrapper) {
		this.priceWrapper = priceWrapper;
	}

}
