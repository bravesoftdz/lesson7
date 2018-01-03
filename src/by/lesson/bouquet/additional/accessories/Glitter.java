package by.lesson.bouquet.additional.accessories;

import by.lesson.bouquet.additional.Accessories;

public class Glitter extends Accessories {
	private String glinderType;

	public Glitter(String title, String color, String glinderType) {
		super.setTitle(title);
		super.setColor(color);
		this.glinderType = glinderType;
		prepareAccessory();
	}

	public void prepareAccessory() {
		super.parameters = glinderType + ", " + super.getColor() + " colour";
	}

	public String getGlinderType() {
		return glinderType;
	}

	public void setGlinderType(String glinderType) {
		this.glinderType = glinderType;
	}

}
