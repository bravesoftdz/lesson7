package by.lesson.bouquet.logic;

import java.util.Arrays;

import by.lesson.bouquet.additional.Accessories;
import by.lesson.bouquet.bean.*;
import by.lesson.bouquet.bean.Flower;
import by.lesson.bouquet.runner.MainApp;

public class Bouquet {

	private Flower[] bouquetArr;
	private int bouquetArrLength;
	private SetFlowers flowers;
	private Accessories[] accessories;
	private double sumBoutique = 0;

	private static int[] lengthFlowers = new int[MainApp.DEFAUL_VALUE_ITEM];
	private static String[] nameFlowerArr = new String[MainApp.DEFAUL_VALUE_ITEM];

	private String allFlowers[][] = new String[MainApp.DEFAUL_VALUE_ITEM][2];

	public Bouquet(SetFlowers flowers) {
		this.flowers = flowers;
		collectBouquet();
	}

	public void collectBouquet() {

		int wildFlowersArrLength = flowers.getSetOfFlowersArr().length;

		bouquetArrLength = wildFlowersArrLength;

		bouquetArr = new Flower[bouquetArrLength];
		for (int i = 0; i < wildFlowersArrLength; i++) {
			bouquetArr[i] = flowers.getSetOfFlowersArr()[i];
		}
	}

	public double getTotalPriceOfBouquet() {
		double totalPrice = 0;
		totalPrice = Accessories.getValueSumAccessories() + sumBoutique;
		return totalPrice;
	}

	public void sortByFresh() {
		Arrays.sort(allFlowers, (a, b) -> Integer.parseInt(a[1]) - Integer.parseInt(b[1]));
	}

	public void printSortByFresh() {
		sortByFresh();
		int j = 0;
		System.out.println();
		System.out.println("            SORT BY FRESH            ");
		System.out.println("-------------------------------------");
		System.out.printf("%5s %15s %15s \t \n", " No" + " |", "Name flower" + " |", "Fresh (%)" + " |");
		System.out.println("-------------------------------------");
		for (int i = 0; i < MainApp.DEFAUL_VALUE_ITEM; i++) {
			j++;
			System.out.printf("%5s %15s %15s \t \n", j + " |", allFlowers[i][0] + " |", allFlowers[i][1] + " |");
		}
		System.out.println("-------------------------------------");
		System.out.println();
	}

	public void printBouquet() {
		int counterReport = 0;
		System.out.println();
		System.out.println("                             ===REPORT===                            ");
		System.out.println();
		System.out.println("                       CONTENTS OF THE BOUQUET                       ");
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("%5s %15s %15s %15s %15s \t \n", " No" + " |", "Name flower" + " |", "Height (cm)" + " |",
				"Width (cm)" + " |", "Price (BYN)" + " |");
		System.out.println("---------------------------------------------------------------------");
		int countFlover = -1;
		for (Flower flower : bouquetArr) {
			countFlover++;
			counterReport++;
			System.out.printf("%5s %15s %15s %15s %15s \t \n", counterReport + " |", flower.getTitle() + " |",
					flower.getStemH() + " |", flower.getStemW() + " |",
					String.format("%.2f", flower.getFlowerPrice()) + " |");
			sumBoutique = sumBoutique + flower.getFlowerPrice();
			lengthFlowers[countFlover] = flower.getStemH();
			nameFlowerArr[countFlover] = flower.getTitle();
			allFlowers[countFlover][0] = flower.getTitle();
			allFlowers[countFlover][1] = String.valueOf(flower.getFresh());
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("%5s %15s %15s %15s %15s \t \n", "", "", "", "TOTAL:" + " |",
				String.format("%.2f", sumBoutique) + " |");
		System.out.println("---------------------------------------------------------------------");
		printSortByFresh();
	}

	public void printBouquetPrice() {
		System.out.println();
		System.out.println("                             TOTAL BILL                              ");
		System.out.println("=====================================================================");
		System.out.printf("%1s %65s \t \n", "",
				"BOUQUET PRICE: " + String.format("%.2f", getTotalPriceOfBouquet()) + " BYN");
		System.out.print("=====================================================================");
	}

	public static void pritLengthFlower() {
		int max = 0;
		String nameFlowerOfLength = "";
		if (lengthFlowers != null && nameFlowerArr != null) {
			for (int i = 0; i < lengthFlowers.length; i++) {
				if (lengthFlowers[i] > max) {
					max = lengthFlowers[i];
					nameFlowerOfLength = nameFlowerArr[i];
				}
			}
			System.out.println();
			System.out.println(
					"*Maximum length of the flower: " + max + "cm. \n Name flower: '" + nameFlowerOfLength + "'");
		} else {
			System.out.println("Error obtaining flower length data.");
		}
	}

	public void addAccessory(Accessories acc) {
		int i = 0;
		accessories = new Accessories[5];
		accessories[i] = acc;
		i++;
	}

}
