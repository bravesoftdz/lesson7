package by.lesson.bouquet.bean;

public class Flower {
	private String title;
	private Bud bud;
	private Stem stem;
	private int stemH;
	private int stemW;
	private double price;
	private int fresh;

	public Flower() {
	}

	public Flower(String title, int stemH, int stemW, float price, int h, int w, int fresh) {

		this.title = title;
		this.stemH = stemH;
		this.stemW = stemW;
		stem = new Stem(this.stemH, this.stemW);
		bud = new Bud();
		this.price = price;
		this.stemH = h;
		this.stemW = w;
		this.setFresh(fresh);

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Bud getBud() {
		return bud;
	}

	public void setBud(Bud bud) {
		this.bud = bud;
	}

	public Stem getStem() {
		return stem;
	}

	public void setStem(Stem stem) {
		this.stem = stem;
	}

	public int getStemH() {
		return stemH;
	}

	public void setStemH(int stemH) {
		this.stemH = stemH;
	}

	public int getStemW() {
		return stemW;
	}

	public void setStemW(int stemW) {
		this.stemW = stemW;
	}

	public double getFlowerPrice() {
		return price;
	}

	public int getFresh() {
		return fresh;
	}

	public void setFresh(int fresh) {
		this.fresh = fresh;
	}

}
