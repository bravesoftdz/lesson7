package by.lesson.bouquet.additional;

import by.lesson.bouquet.additional.accessories.Ribbon;

public class Accessories {
	private String title;
	private String color;
	protected String parameters;
	private double sumPrice;
	public static double valueSumAccessories = 0;
	public static int countInt = -1;
	public static int countIntAccessories = 0;
	private static String allAccessorArr[][] = new String[3][3];

	public Accessories() {

	}

	public Accessories(String title, String color) {
		this.title = title;
		this.color = color;
	}

	public void getAccessoryInfo(double p) {
		countInt++;
		if (this.getTitle() == "Ribbon" && Ribbon.getAmount() > 1) {
			valueSumAccessories = valueSumAccessories + (p * Ribbon.getAmount());
			allAccessorArr[countInt][0] = this.getTitle();
			allAccessorArr[countInt][1] = parameters;
			allAccessorArr[countInt][2] = String.format("%.2f", p * Ribbon.getAmount());
		} else {
			valueSumAccessories = valueSumAccessories + p;
			allAccessorArr[countInt][0] = this.getTitle();
			allAccessorArr[countInt][1] = parameters;
			allAccessorArr[countInt][2] = String.format("%.2f", p);
		}
	}

	public static void printAllAccessor() {
		System.out.println("                        ADDITIONAL TO A BOUQUET                      ");
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("%5s %14s %34s %13s \t \n", " No" + "|", "Name" + " |", "Parameters" + " |",
				"Price (BYN)" + " |");
		System.out.println("---------------------------------------------------------------------");
		for (int i = 0; i < allAccessorArr.length; i++) {
			countIntAccessories++;
			System.out.printf("%5s %14s %34s %13s \t \n", countIntAccessories + " |", allAccessorArr[i][0] + " |",
					allAccessorArr[i][1] + " |", allAccessorArr[i][2] + " |");
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("%20s %34s %13s \t \n", "", "TOTAL:" + " |",
				String.format("%.2f", valueSumAccessories) + " |");
		System.out.println("---------------------------------------------------------------------");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSumPrice() {
		return sumPrice;
	}

	public static double getValueSumAccessories() {
		return valueSumAccessories;
	}

}
