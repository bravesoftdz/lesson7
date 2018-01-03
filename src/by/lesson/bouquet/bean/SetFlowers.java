package by.lesson.bouquet.bean;

public class SetFlowers extends Flower {

	private String setOfFlowersTitle;
	private Flower[] setOfFlowers;
	private int i = 0;

	public SetFlowers(String setOfFlowersTitle, int amountOfFlowers) {
		this.setOfFlowersTitle = setOfFlowersTitle;
		setOfFlowers = new Flower[amountOfFlowers];
	}

	public void addFlowerToSet(String title, float price, int h, int w, int fresh) {
		super.setTitle(title);
		setOfFlowers[i] = new Flower(super.getTitle(), super.getStemH(), super.getStemW(), price, h, w, fresh);
		i++;
	}

	public String getSetOfFlowersTitle() {
		return setOfFlowersTitle;
	}

	public Flower[] getSetOfFlowersArr() {
		return setOfFlowers;
	}
}
