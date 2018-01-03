package by.lesson.bouquet.runner;

import java.io.File;
import java.util.ArrayList;

import by.lesson.bouquet.additional.Accessories;
import by.lesson.bouquet.additional.accessories.Glitter;
import by.lesson.bouquet.additional.accessories.Ribbon;
import by.lesson.bouquet.additional.accessories.Wrapper;
import by.lesson.bouquet.bean.SetFlowers;
import by.lesson.bouquet.logic.Bouquet;
//import flowers
import by.lesson.bouquet.additional.flowers.*;

/*
Цветочница. 
1. Определить иерархию цветов. 
2. Создать несколько объектов-цветов. 
3. Собрать букет (используя аксессуары) с определением его стоимости. 
4. Провести сортировку цветов в букете на основе уровня свежести. 
5. Найти цветок в букете, соответствующий заданному диапазону длин стеблей. 
 */

public class MainApp {

	public static final int DEFAUL_VALUE_ITEM = 6;
	public static int countOfItemArray = 0;

	public static void main(String[] args) {

		SetFlowers setFlowers = new SetFlowers("Flowers", DEFAUL_VALUE_ITEM);		
		setFlowers.addFlowerToSet(Lily.getName(), Lily.getPrice(), Lily.getHeight(), Lily.getWidth(), Lily.getFresh());
		setFlowers.addFlowerToSet(Rose.getName(), Rose.getPrice(), Rose.getHeight(), Rose.getWidth(), Rose.getFresh());
		setFlowers.addFlowerToSet(RareLily.getName(), RareLily.getPrice(), RareLily.getHeight(), RareLily.getWidth(), RareLily.getFresh());
		setFlowers.addFlowerToSet(SmallRose.getName(), SmallRose.getPrice(), SmallRose.getHeight(),	SmallRose.getWidth(), SmallRose.getFresh());
		setFlowers.addFlowerToSet(Gloriy.getName(), Gloriy.getPrice(), Gloriy.getHeight(), Gloriy.getWidth(), Gloriy.getFresh());
		setFlowers.addFlowerToSet(Chamomile.getName(), Chamomile.getPrice(), Chamomile.getHeight(),	Chamomile.getWidth(), Chamomile.getFresh());

		Bouquet bouquet = new Bouquet(setFlowers);

		bouquet.printBouquet();

		Accessories acc1 = new Wrapper("Wrapper", "transparent", "square");
		Accessories acc2 = new Ribbon("Ribbon", "purple", 5);
		Accessories acc3 = new Glitter("Glitter", "silver", "particle - stars");

		bouquet.addAccessory(acc1);
		acc1.getAccessoryInfo(1.11);

		bouquet.addAccessory(acc2);
		acc2.getAccessoryInfo(2.22);

		bouquet.addAccessory(acc3);
		acc3.getAccessoryInfo(3.33);

		Accessories.printAllAccessor();

		bouquet.printBouquetPrice();
		Bouquet.pritLengthFlower();

	}

	public static int getCountOfItemArray() {
		return countOfItemArray;
	}

}
